package com.practice.main;

import com.practice.bean.Student;
import com.practice.resource.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = (Student) context.getBean("stu1");//method name == bean id
        System.out.println(std);
        System.out.println("*********************");
        Student student2 = (Student) context.getBean("stuObj");//beanid is different from method name
        System.out.println(student2);
//        System.out.println("*********************");
//        Student student3 = (Student) context.getBean(Student.class);
//        System.out.println(student3);
    }
}
