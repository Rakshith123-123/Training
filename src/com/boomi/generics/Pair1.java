package com.boomi.generics;

public class Pair1<K, V> {

    private K key;
    private V value;

    public Pair1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }

    public static void main(String[] args) {
        Pair1<Integer, String> p1 = new Pair1<>(1, "apple");
        Pair1<Integer, String> p2 = new Pair1<>(2, "pear");
        boolean same = Util.compare(p1, p2);
    }
}