package com.practice.com.practice.config;

import com.practice.bean.Address;
import com.practice.bean.Student;
import com.practice.bean.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddress(){
        Address address = new Address();
        address.setHouseNo(10);
        address.setCity("Ahemdabad");
        return address;
    }
    @Bean
    public Subject createSubject(){
        Subject subject = new Subject();
        List<String> subjectList = new ArrayList<String>();
        subjectList.add("java");
        subjectList.add("Python");
        subjectList.add("C#");
        subject.setSubjects(subjectList);
        return subject;
    }
    @Bean
    public Subject sub2(){
        Subject subject = new Subject();
        List<String> subjectList = new ArrayList<String>();
        subjectList.add("wwww");
        subjectList.add("nnnnn");
        subjectList.add("Ccccc");
        subject.setSubjects(subjectList);
        return subject;
    }

    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("Shabbir");
        //for autowiring we need not to provide the dependency manually as we used to do for setter and constructor injection but in the Student class we will write the @Autowired annotation above the mentioned reference
        //setter dependency injection
//        student.setAddress(createAddress());
//        student.setSubject(createSubject());

        return student;
    }
}
