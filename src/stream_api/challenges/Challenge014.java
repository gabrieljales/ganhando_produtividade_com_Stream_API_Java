package stream_api.challenges;

import stream_api.util.PrimeUtils;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 14 - Encontre o maior número primo da lista:
* Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
* */

public class Challenge014 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer highestPrimeNumber = numbers
                .stream()
                .filter(PrimeUtils::isPrime) // Utiliza o método isPrime para verificar quais números são primos
                .max(Integer::compareTo) // Retorna um Optional com o maior valou ou vazio
                .orElse(null); // Se o valor não estiver presente, retorna nulo

        String message = highestPrimeNumber == null
                ? "Nenhum número primo foi encontrado na lista"
                : "O maior número primo da lista é: " + highestPrimeNumber;

        System.out.println(message);
    }
}
