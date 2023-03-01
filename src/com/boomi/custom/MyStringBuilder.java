package com.boomi.custom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringBuilder {
    private static final int DEFAULT_CAPACITY = 16;
    private char[] value;
    private int count;
    private Pattern pattern;

    public MyStringBuilder() {
        value = new char[DEFAULT_CAPACITY];
        count=0;
    }

    public MyStringBuilder(String string, String regex) {
        this();
        if (regex != null) {
            pattern = Pattern.compile(regex);
        }
        append(string);
    }

    public MyStringBuilder(String string){
        this(string,".*");
    }

    public synchronized MyStringBuilder append(String str) {
        if (pattern != null) {
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid string: " + str);
            }
        }

        if (str == null) {
            str = "null";
        }

        int len = str.length();
        ensureCapacity(count + len);

        for (int i = 0; i < len; i++) {
            value[count++] = str.charAt(i);
        }

        return this;
    }

    public synchronized MyStringBuilder delete(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }

        if (end > count) {
            end = count;
        }

        if (start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        int len = end - start;
        if (len > 0) {
            for (int i = start; i < count-len; i++) {
                value[i] = value[i + len];
            }
            count -= len;
        }
        return this;
    }

    public synchronized MyStringBuilder insert(int offset, String str) {
        if (offset < 0 || offset > count) {
            throw new IndexOutOfBoundsException();
        }

        if (pattern != null) {
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid string: " + str);
            }
        }

        if (str == null) {
            str = "null";
        }

        int len = str.length();
        ensureCapacity(count + len);

        for (int i = count - 1; i >= offset; i--) {
            value[i + len] = value[i];
        }
        for (int i = 0; i < len; i++) {
            value[offset + i] = str.charAt(i);
        }
        count += len;

        return this;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > value.length) {
            int newCapacity = value.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            char[] newValue = new char[newCapacity];
            for (int i = 0; i < count; i++) {
                newValue[i] = value[i];
            }
            value = newValue;
        }
    }

    public synchronized String toString() {
        return new String(value, 0, count);
    }

    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("hello","[a-z ]+");
        System.out.println(myStringBuilder);
        myStringBuilder.append(" world");
        System.out.println(myStringBuilder);
        myStringBuilder.delete(4,myStringBuilder.toString().length());
        System.out.println(myStringBuilder);
        MyStringBuilder myStringBuilder1 = new MyStringBuilder("Hello World This is a custom String");
        System.out.println(myStringBuilder1);
        myStringBuilder1.insert(5,"nan ");
        System.out.println(myStringBuilder1);
    }
}

