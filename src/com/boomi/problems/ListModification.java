package com.boomi.problems;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ListModification {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < numbers.size(); i++) {
            int squared = numbers.get(i) * numbers.get(i);
            numbers.set(i, squared);
        }
        System.out.println(numbers);


        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> squaredNumbers = numbers1.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);


        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 5));
        Iterator<Integer> iterator = numbers2.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove(); //Using the iterator's remove() method ensures that the list is modified safely while iterating.
            }
        }

        System.out.println(numbers2);


        List<Integer> numbers3 = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer number : numbers3) {
            if (number % 2 == 0) {
                numbers3.remove(number);
            }
        }
        System.out.println(numbers3);

        List<String> words = new CopyOnWriteArrayList<>(Arrays.asList("hello", "world", "java"));
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.startsWith("j")) {
                words.set(i, word.toUpperCase());
                words.remove("world");
            }
        }

        System.out.println(words);

        List<Integer> numbers4 = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < numbers4.size(); i++) {
            if (numbers4.get(i) % 2 == 0) {
                numbers4.add(numbers4.get(i) + 1);
            }
        }

        System.out.println(numbers4);

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        Iterator<Map.Entry<String, Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            if (entry.getValue() % 2 == 0) {
                iterator1.remove();
            }
        }

        System.out.println(map);

        List<Integer> numbers5 = new CopyOnWriteArrayList<>(Arrays.asList(10, 9, 8, 7, 6));
        numbers5.removeIf(x -> x % 2 == 0);

        System.out.println(numbers5);

        List<Integer> numbers6 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        numbers6.replaceAll(x -> x * x);

        System.out.println(numbers6);

        Set<Integer> numbers7 = new ConcurrentSkipListSet<>(Arrays.asList(1, 7, 6, 4, 5));
        for (int number : numbers7) {
            if (number % 2 == 0) {
                numbers7.remove(number);
            }
        }

        System.out.println(numbers7);






    }
}
