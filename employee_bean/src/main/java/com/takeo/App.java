package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
        Employee em = (Employee) factory.getBean("emp");
        System.out.println(em.getEno()+ "\t" + em.getEname());
        Employee em1 = (Employee) factory.getBean("em");
        System.out.println(em1.getSal() +"\t"+  em1.getCity());
        
    }
}
