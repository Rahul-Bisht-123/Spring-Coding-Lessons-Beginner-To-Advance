package com.Rb.SpringJavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Coder coderBean = context.getBean(Coder.class);
        
        coderBean.code();
//        coderBean.age = 99;
        System.out.println(coderBean.age);
        
        Coder coderBean2 = context.getBean(Coder.class);
        
        coderBean2.code();
        System.out.println(coderBean2.age);
        
//        coderBean.code();
//        Desktop bean1 = context.getBean("desktopBean",Desktop.class);
        
//        bean1.cost = 20_000;
//        System.out.println(bean1.cost);
//        bean1.compile();
        
        
//        Desktop bean2 = context.getBean("desktopBean",Desktop.class);
//        System.out.println(bean2.cost);
//        bean2.compile();
        
        ((AbstractApplicationContext) context).close();
    }
}
