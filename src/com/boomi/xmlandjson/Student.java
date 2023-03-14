package com.boomi.xmlandjson;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
    private int id;
    private String name;
    private int age;
    private String major;

    public Student() {
        // Required default constructor for JAXB
    }

    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
