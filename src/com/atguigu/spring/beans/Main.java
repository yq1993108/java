package com.atguigu.spring.beans;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args){
		/*
		//����HelloWorld
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("atguigu");
		*/
		//1.����spring��IOC��������
		ApplicationContext  ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡBeanʵ��
		//HelloWorld helloWorld =(HelloWorld)ctx.getBean("helloWorld");
		
		//3.����hello����
		//helloWorld.hello();
	}
}
