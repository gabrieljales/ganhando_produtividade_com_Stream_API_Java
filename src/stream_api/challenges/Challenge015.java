package stream_api.challenges;

import stream_api.util.PrimeUtils;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
* Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
* */

public class Challenge015 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean hasNegativeNumber = numbers.stream().anyMatch(number -> number < 0);

        String message = hasNegativeNumber
                ? "A lista contém ao menos um número negativo!"
                : "A lista não contém números negativos!";

        System.out.println(message);
    }
}
