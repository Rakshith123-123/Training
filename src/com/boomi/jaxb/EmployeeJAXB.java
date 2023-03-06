package com.boomi.jaxb;

import javax.xml.bind.*;
import java.io.File;
import java.io.StringWriter;

public class EmployeeJAXB {
    public void marshall(){
        try{
            Employee emp=new Employee("Rakshith","Ramanagara",1,60000);
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(emp,System.out);
            File f=new File("emp.xml");
            marshaller.marshal(emp,f);
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(emp,stringWriter);
            System.out.println(stringWriter.toString());
        }catch (Exception e){
            System.out.println(""+e.getMessage());
        }
    }

    public void unmarshall() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Employee emp = (Employee) unmarshaller.unmarshal(new File("emp.xml"));
            System.out.println(emp.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
