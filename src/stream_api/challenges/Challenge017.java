package stream_api.challenges;

import stream_api.util.PrimeUtils;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 17 - Filtrar os números primos da lista:
* Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
* */

public class Challenge017 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primeNumbers = numbers
                .stream()
                .filter(PrimeUtils::isPrime) // Utiliza o método isPrime para verificar quais números são primos
                .toList();

        String message = primeNumbers.isEmpty()
                ? "Nenhum número primo foi encontrado na lista"
                : "Números primos encontrados: " + primeNumbers;

        System.out.println(message);
    }
}
