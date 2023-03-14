package com.boomi.xmlandjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main1 {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StudentList studentFromJson = mapper.readValue(new File("/Users/rakahithrk/Desktop/StudentList.json"), StudentList.class);

        JAXBContext jaxbContext = JAXBContext.newInstance(StudentList.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StudentList studentFromXml = (StudentList) unmarshaller.unmarshal(new File("/Users/rakahithrk/Desktop/StudentList.xml"));

        System.out.println(studentFromJson.getName());
        System.out.println(studentFromXml.getName());
    }
}

