package com.practice.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("createSubject")
    private Subject subject;

    // the @Autowired Annotation will itself will inject the dependency, and we need not do it manually
    // let suppose, if there exist two Address bean object then, which on will @Autowired will automatically inject
    // the answer to that scenario is @Autowired will get confused and will throw exception
    // to solve the problem we will use @Qualifier("BeanId") annotation, where the bean object of the BeanId or name will we selected from all the available bean object
    // for our example there are two beans for Subject (createSubject and sub2) out of which Qualifier will automatically inject createSubject as it is passed in the parameter
    //also note that @Qualifier will be of no use without @Autowired, so when ever you need to remove ambiguity with the help of @Qualifier then @Autowired will always be declared above, if not then their will not be any automatic DI.

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
