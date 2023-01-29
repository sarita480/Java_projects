package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.Student;

public class App {
  public static void main(String[] args) 
  {
    
    BeanFactory factory = new XmlBeanFactory (new ClassPathResource("com\\takeo\\config\\spring.xml"));
    Student stu = (Student) factory.getBean("stu");
    System.out.println(stu.getSno() + "\t" + stu.getSname()+ "\t"+ stu.getLname()+ "\t"+ stu.getSadd());
    
  }
}
