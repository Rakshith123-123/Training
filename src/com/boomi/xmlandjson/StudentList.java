package com.boomi.xmlandjson;
import java.util.List;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@XmlRootElement(name = "StudentList", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentList {
    @XmlElement
    @JsonProperty("name")
    private String name;

    @XmlElement
    @JsonProperty("age")
    private int age;

    @XmlElement
    @JsonProperty("gender")
    private String gender;

    @XmlElementWrapper(name="address")
    @XmlElement(name="address")
    @JsonProperty("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Address> address;


    @XmlElementWrapper(name="courses")
    @XmlElement(name="course")
    @JsonProperty("courses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
