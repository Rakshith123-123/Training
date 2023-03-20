package com.boomi.jaxb;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
public class Employee {
    @XmlElement(name="name")
    String name;
    @XmlElement(name="address")
    String address;
    @XmlElement(name="id")
    int id;
    @XmlElement(name="salary")
    int salary;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, int id, int salary) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
