package com.practice.main;

import com.practice.bean.Student;
import com.practice.com.practice.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.RouteMatcher;

public class Main {
    public static void main(String[] args) {
        ApplicationContext javaBasedconfig = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student stu1 = javaBasedconfig.getBean("createStudent", Student.class);
        System.out.println(stu1);
    }
}
