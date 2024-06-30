package com.Rb.App.service;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	
	private String secretKey;
	
	public JwtService() {
		secretKey = generateSecretKey();
	}
	
	
	private String generateSecretKey() {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
			SecretKey secretKey = keyGen.generateKey();
			System.out.println("Secret Key : " + secretKey.toString());
			return Base64.getEncoder().encodeToString(secretKey.getEncoded());
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error in generating key" , e);
		}
	}


	public String generateToken(String username) {

		
		Map<String, Object> claims = new HashMap<>();
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 3))
				.signWith(getKey(), SignatureAlgorithm.HS256).compact();
	}


	private Key getKey() {
		byte[] keyBytes = Decoders.BASE64.decode(secretKey);
		return Keys.hmacShaKeyFor(keyBytes);
	}


	public String extractUserName(String token) {
		// TODO Auto-generated method stub
		return null;
	}
	
}