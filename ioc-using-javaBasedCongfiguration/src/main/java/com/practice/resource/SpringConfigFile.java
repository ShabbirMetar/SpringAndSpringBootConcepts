package com.practice.resource;

import com.practice.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
// the @Configuration annotation suggest that the the file is here for bean configuration
// in xml based config we were writing the schema in java based configuration we are declaring annotaion for the class
// in java based configuration we define a method to create the instance of the bean class or pojo class
// and the @Bean annotation is used to declare a method as a factory for creating and configuring a bean managed by a container

    @Bean
    public Student stu1(){
        //method name is the id of the instance of the bean
        Student std = new Student();
        std.setAge(30);
        std.setName("Shabbir");
        return std;
    }
    @Bean("stuObj")
    public Student createStudentBean(){
        //@Bean("xyz") will create beans with id xyz// here in our case stuObj
        //this seprates method name with the bean id
        Student std = new Student();
        std.setAge(15);
        std.setName("Ali");
        std.setEmail("Ali@gmail.com");
        return std;
    }
}