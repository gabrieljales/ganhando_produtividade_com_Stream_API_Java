package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* esafio 5 - Calcule a média dos números maiores que 5:
* Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
* */

public class Challenge005 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double numbersBiggerThenFiveAverage = numbers.stream()
                .filter(number -> number > 5) // Filtrando somente números maiores que 5
                .mapToDouble(number -> number.doubleValue()) // Convertendo inteiros em ponto flutuante (double). Usando method reference, ficaria assim .mapToDouble(Integer::doubleValue)
                .average() // Retorna um Optional, mais especificamente o OptionalDouble, contendo a média ou vazio (null)
                .orElse(0.0); // Para tratar os casos em que o resultado é vazio (poderia também lançar uma exceção, com o .orElseThrow())

        System.out.println(numbersBiggerThenFiveAverage);
    }
}
