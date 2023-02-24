package com.boomi.generics;
public class Util {
    public static <K, V> boolean compare(Pair1<Integer, String> p1, Pair1<Integer, String> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
