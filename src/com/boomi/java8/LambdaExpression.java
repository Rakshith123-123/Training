package com.boomi.java8;

import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (n) -> n * n;

        int result = square.apply(5);

        System.out.println(result);
    }
}
