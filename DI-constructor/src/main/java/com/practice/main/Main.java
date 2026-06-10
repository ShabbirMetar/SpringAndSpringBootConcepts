package com.practice.main;

import com.practice.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Using setter injection");
        Student student1 = (Student) context.getBean("stu1");
        System.out.println(student1);
        System.out.println("Using constructor injection");
        Student student2 = (Student) context.getBean("stu2");
        System.out.println(student2);
    }
}
