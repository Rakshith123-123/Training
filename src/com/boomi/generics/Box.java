package com.boomi.generics;

public class Box<T> {
    // T stands for "Type"
    private T t;

    public void setBox(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        Box<String> b=new Box();
        b.setBox("String");
        System.out.println(b.get());

    }
}
