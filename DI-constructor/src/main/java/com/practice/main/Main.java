package com.practice.main;

import com.practice.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = (Student) context.getBean("stu1");
        System.out.println(student1);
    }
}
