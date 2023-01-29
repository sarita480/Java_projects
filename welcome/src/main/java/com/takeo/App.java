package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.Welcome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Initialize the container. There are two core containers 1)beanFactory 2)Application context
    	//bean factory loads the configuration file and when we use the getBean() it creates the bean class object and inject the values.
    	//Application is a container it loads the configuration file and create the bean class object.
    	//Beanfactory is an interface.
    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
    Welcome hello = (Welcome)factory.getBean("wl");
    System.out.println(hello.getWelcome());
    }
}
