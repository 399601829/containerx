package com.frank.containerx.demo;

import java.util.ArrayList;

import com.frank.containerx.demo.model.Person;
import com.frank.containerx.factory.XmlBeanFactory;

/**
 * containerx的demo
 * @author Frank Liu(liushaomingdev@163.com)
 *
 */
public class DemoApp {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory("beans.xml");
		Person person = (Person)beanFactory.getBean("myPerson");
		
		System.out.println("name=" + person.getName());
		System.out.println("address=" + person.getAddress());
		
		Person person1 = (Person)beanFactory.getBean("myPerson");
		System.out.println("person=" + person);
		System.out.println("person1=" + person1);
		System.out.println("person == person1? " + (person == person1));
	}
}
