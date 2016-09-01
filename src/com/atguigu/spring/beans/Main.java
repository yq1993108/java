package com.atguigu.spring.beans;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args){
		/*
		//创建HelloWorld
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("atguigu");
		*/
		//1.创建spring的IOC容器对象
		ApplicationContext  ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取Bean实例
		//HelloWorld helloWorld =(HelloWorld)ctx.getBean("helloWorld");
		
		//3.调用hello方法
		//helloWorld.hello();
	}
}
