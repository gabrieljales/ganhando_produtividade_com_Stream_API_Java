package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
* Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
* */

public class Challenge010 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream().filter(number -> number % 2 != 0 && (number % 3 == 0 || number % 5 == 0)).forEach(System.out::println);
    }
}
