package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 2 - Imprima a soma dos números pares da lista:
* Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
* */

public class Challenge002 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       Integer finalResult = numbers.stream().filter(number -> number % 2 == 0).reduce(0, Integer::sum);

       // Outra maneira:
//        int finalResult = numbers.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println(finalResult);
    }
}
