package stream_api.challenges;

import stream_api.util.PrimeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Desafio 18 - Verifique se todos os números da lista são iguais:
* Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
* */

public class Challenge018 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Boolean> result = new ArrayList<>();

        numbers.forEach(number1 -> {
            boolean targetNumber = numbers.stream().allMatch(number2 -> number2.equals(number1));
            result.add(targetNumber);
        });

        boolean allNumbersAreEqual = result.stream().allMatch(value -> value);
        String message = allNumbersAreEqual ? "Todos os números são iguais!" : "Há números diferentes na lista!";

        System.out.println(message);
    }
}
