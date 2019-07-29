package com.sindhu.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sindhu.helloworld.services.HelloWorldServices;

public class Hello {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		
ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
HelloWorldServices service=(HelloWorldServices)con.getBean("helloWorldService");
String message=service.sayHello();
System.out.println(message);
		
service.setName("Spring");
message=service.sayHello();
System.out.println(message);
		
	}

}
