package com.practice.main;

import com.practice.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student StuByName =  context.getBean("stu1", Student.class);
        System.out.println(StuByName);

        Student stuByType = context.getBean("stu2",Student.class);
        System.out.println(stuByType);
    }
}
