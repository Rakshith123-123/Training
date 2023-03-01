package com.boomi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperaions {
    public static void main(String[] args) {
//        Intermediate operations are operations that are applied to a stream and return a new stream.
//        They are used to transform the original stream and can be chained together to create a pipeline of operations.
//        Some examples of intermediate operations include filter, map, flatMap, sorted, distinct, limit, and skip.
//        filter: Allows you to filter elements based on a given predicate. The resulting stream will contain only the elements that satisfy the predicate.
//        map: Allows you to transform elements into another type by applying a given function.
//        flatMap: Allows you to flatten a stream of streams into a single stream by applying a given function that maps each element to a stream.
//        sorted: Allows you to sort the elements of a stream based on a given comparator.
//        distinct: Allows you to remove duplicate elements from a stream based on the elements' equals() method.
//        limit: Allows you to truncate a stream to a maximum size.
//        skip: Allows you to skip a number of elements from the beginning of a stream.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        List<String> strings = Arrays.asList("RK", "Aarohi", "Pathan");
        List<Integer> stringLengths = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(stringLengths);

        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(11, 12, 13), Arrays.asList(6, 7, 8, 9));
        List<Integer> allNumbers = nestedNumbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(allNumbers);

        List<String> strings1 = Arrays.asList("natsu dragneal", "iron man", "ant man");
        List<String> sortedStrings = strings1.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedStrings);

        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> uniqueNumbers = duplicateNumbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);

        List<Integer> toLimitNumbers = Arrays.asList(1, 7, 8, 4, 5, 6);
        List<Integer> limitedNumbers = toLimitNumbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers);

        List<Integer> toSkipNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> skippedNumbers = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(skippedNumbers);

    }
}
