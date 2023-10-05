package stream_api.challenges;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
* Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
* */

public class Challenge009 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Gerando uma nova lista somente com números distintos
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();

        // Comparando o tamanho da lista original e a nova lista
        String message = (numbers.size() == distinctNumbers.size())
                ? "Todos os números da lista são distintos!"
                : "Há repetições na lista!";

        System.out.println(message);

        // Resolução somente com Stream API:
//        boolean hasDuplicates = numbers.stream().anyMatch(number -> numbers.stream().filter(n -> n.equals(number)).count() > 1);
    }
}
