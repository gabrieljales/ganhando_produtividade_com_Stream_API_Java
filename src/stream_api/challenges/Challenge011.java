package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
* Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
* */

public class Challenge011 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer sumOfSquaredNumbers = numbers.stream().map(number -> number * number).reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados de todos os números é igual a: " + sumOfSquaredNumbers);
    }
}
