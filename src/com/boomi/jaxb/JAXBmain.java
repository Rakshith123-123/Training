package com.boomi.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBmain {
    public static void main(String[] args) throws JAXBException {
        EmployeeJAXB employeeJAXB = new EmployeeJAXB();
        employeeJAXB.marshall();
        employeeJAXB.unmarshall();
    }
}
