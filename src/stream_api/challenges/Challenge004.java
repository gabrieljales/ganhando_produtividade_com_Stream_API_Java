package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge004 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0 || number == 0).toList();

        System.out.println(evenNumbers);
    }
}
