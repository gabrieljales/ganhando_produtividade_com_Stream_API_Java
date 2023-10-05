package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 1 - Mostre a lista na ordem numérica:
* Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
* */

public class Challenge001 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream().sorted().forEachOrdered(System.out::println);
    }
}
