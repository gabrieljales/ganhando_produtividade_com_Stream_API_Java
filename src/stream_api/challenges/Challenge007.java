package stream_api.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Desafio 7 - Encontrar o segundo número maior da lista:
* Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
* */

public class Challenge007 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer secondHighestNumber = numbers.stream()
                .distinct()  // Remove elementos repetidos
                .sorted(Comparator.reverseOrder())  // Ordena os números na ordem decrescente
                .skip(1)  // Pula o primeiro número
                .findFirst()  // Encontra o primeiro elemento após o pulo
                .orElse(null);  // Se não encontrar, retorna null

        System.out.println(secondHighestNumber);
    }
}
