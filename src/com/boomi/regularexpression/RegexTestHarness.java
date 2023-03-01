package com.boomi.regularexpression;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){

        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter regex");
        String regex = sc.nextLine();
        System.out.println("enter to match");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean found =false;
            while (matcher.find()) {
                System.out.println(regex + " matches " + matcher.group() + " starts at " + matcher.start() + " ends at " + matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("not matches");
            }
        }
    }
}