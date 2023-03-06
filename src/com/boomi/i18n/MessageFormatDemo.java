package com.boomi.i18n;

import java.util.*;
import java.text.*;

public class MessageFormatDemo {

    static  void displayMessage(Locale currentLocale) {

        System.out.println("currentLocale = " + currentLocale.toString());
        System.out.println();

        ResourceBundle messages =
                ResourceBundle.getBundle("MessageBundle",currentLocale);

        Object[] messageArguments = {
                messages.getString("planet"),
                new Integer(7),
                new Date()
        };

        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(currentLocale);

        formatter.applyPattern(messages.getString("template"));
        String output = formatter.format(messageArguments);

        System.out.println(output);

    }

    static public void main(String[] args) {
        displayMessage(new Locale("en", "US"));
        System.out.println();
        displayMessage(new Locale("de", "DE"));

//        currentLocale = en_US
//        At 10:16 AM on July 31, 2009, we detected 7
//        spaceships on the planet Mars.
//                currentLocale = de_DE
//        Um 10:16 am 31. Juli 2009 haben wir 7 Raumschiffe
//        auf dem Planeten Mars entdeckt.
    }
}

