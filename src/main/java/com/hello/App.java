package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Vehicle Pjs = new Car();
        Vehicle pjs = (Vehicle) context.getBean("motor");
        // di setiap class yg mau kita panggil hrus ada @Component
        pjs.drive();
        System.out.println( "Hello World!" );

        // shit bro!!!
        // the spring.xml need to be place in src/main/java/spring.xml not test!!! not inside the hello!!

        // for bean property
        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}
