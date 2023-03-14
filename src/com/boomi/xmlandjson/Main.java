package com.boomi.xmlandjson;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student(1, "John Doe", 20, "Computer Science");

        String xml = StudentXmlConverter.convertToXml(student);
        System.out.println(xml);

        String json = StudentJsonConverter.convertToJson(student);
        System.out.println(json);
    }
}

