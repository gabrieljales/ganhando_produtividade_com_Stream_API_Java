package stream_api.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Desafio 16 - Agrupe os números em pares e ímpares:
* Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo
* os números ímpares da lista original, e exiba os resultados no console.
* */

public class Challenge016 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> evenNumbers = numbers.stream().collect(Collectors.groupingBy(number -> number % 2 == 0));

        evenNumbers.forEach((isEven, list) -> {
            String message = isEven ? "Números pares: " : "Números ímpares: ";
            System.out.println(message + list);
        });
    }
}
