package com.spring.begin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Animal obj=(Animal)context.getBean("animal");
        obj.eating();
        context.close();
    }
}
