package com.boomi.generics;

public class Box<T> {
    // T stands for "Type"
    private T t;

    public void setBox(T t) { this.t = t; }
    public T get() { return t; }
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<String> b=new Box();
        b.setBox("String");
        System.out.println(b.get());
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setBox(new Integer(10));
        integerBox.inspect(10);

    }
}
