package com.boomi.jaxb;

import javax.xml.bind.JAXBException;

public class JAXBmain {
    public static void main(String[] args) throws JAXBException {
        EmployeeJAXB employeeJAXB = new EmployeeJAXB();
        employeeJAXB.marshall();
        employeeJAXB.unmarshall();
    }
}
