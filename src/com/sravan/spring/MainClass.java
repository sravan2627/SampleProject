package com.sravan.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class MainClass 

{
public static void main(String args[])
{
	//Triangle triangle= new Triangle();
	//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
	
/*	trian.setName("sravan");
	trian.Draw();*/
	Triangle1 triangle= (Triangle1) context.getBean("triangle");
triangle.Draw();
}
}