import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
//      Terminal operations are operations that are applied to a stream and produce a result,
//      which means that they do not return a new stream. When a terminal operation is called,
//      the stream is consumed, and the result is returned. Some examples of terminal operations include
//      forEach, toArray, reduce, collect, min, max, count, and anyMatch.
//      forEach: Allows you to iterate over each element in the stream and perform an action on it.
//      toArray: Allows you to convert a stream into an array.
//      reduce: Allows you to reduce the elements of a stream into a single value based on a given accumulator function.
//      collect: Allows you to accumulate the elements of a stream into a collection or a container.
//      min: Allows you to find the minimum element in a stream based on a given comparator.
//      max: Allows you to find the maximum element in a stream based on a given comparator.
//      count: Allows you to count the number of elements in a stream.
//      anyMatch: Allows you to check if any element in the stream matches a given predicate.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);

        System.out.println(sum);

        List<String> strings = Arrays.asList("pwc", "dell", "boomi");
        strings.stream().forEach(s -> System.out.println(s));

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer[] evenNumbersArray = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);

        System.out.println(evenNumbersArray);

        List<String> strings1 = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseStrings = strings1.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        long evenNumberCount = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(evenNumberCount);

        List<Integer> numbers3 = Arrays.asList(5, 2, 8, 1, 9);
        Optional<Integer> minNumber = numbers3.stream().min(Integer::compare);

        if(minNumber.isPresent()){
            System.out.println(minNumber.get());
        }

        List<Integer> numbers4 = Arrays.asList(5, 2, 8, 1, 9);
        Optional<Integer> maxNumber = numbers4.stream().max(Integer::compare);

        System.out.println(maxNumber);

        List<String> strings2 = Arrays.asList("apple", "banana", "cherry");
        Optional<String> firstString = strings2.stream().findFirst();

        System.out.println(firstString);

        Optional<String> anyString = strings2.stream().findAny();

        System.out.println(anyString);

        boolean anyEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);

        System.out.println(anyEvenNumber);

    }
}
