package com.boomi.problems;

public class ObjectCreationCheck {

    private static int objCount = 0;
    private static ObjectCreationCheck object;
    private ObjectCreationCheck(){
        objCount++;
        System.out.println("Restricted object creation "+objCount);
    }

    public static ObjectCreationCheck getInstance(){
        if(objCount < 5){
            object = new ObjectCreationCheck();
        }else{
            System.out.println("Instance are restricted for creation up to 5");
        }
        return object;
    }
}
