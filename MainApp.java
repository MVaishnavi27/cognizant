package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
      obj.getMessage();
      HelloWorld1 obj1 = (HelloWorld1) context.getBean("HelloWorld1");
      obj1.getMessage1();
   }
}