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

        boolean allNumbersAreEqual = numbers.stream()
                .allMatch(number -> number.equals(numbers.get(0)));

        String message = allNumbersAreEqual ? "Todos os números são iguais!" : "Há números diferentes na lista!";

        System.out.println(message);
    }
}
