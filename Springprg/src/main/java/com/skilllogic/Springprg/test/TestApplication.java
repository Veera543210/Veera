package com.skilllogic.Springprg.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.skilllogic.Springprg.beans.Employee;

public class TestApplication {

	public static void main(String[] args) {
	FileSystemResource file=new FileSystemResource("src/main/java/com/skilllogic/Springprg/resources/applicationContext.xml");
XmlBeanFactory resource = new XmlBeanFactory(file);
Employee e=(Employee)resource.getBean("emp");
e.display();
	}

}
