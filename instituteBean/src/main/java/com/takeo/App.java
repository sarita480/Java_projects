package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.InstituteBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory =  new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
    	InstituteBean ib = (InstituteBean) factory.getBean("ib");
    	ib.display();
    }
}
