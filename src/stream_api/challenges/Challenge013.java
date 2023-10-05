package stream_api.challenges;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
* Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
* */

public class Challenge013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        try {
            System.out.println("Forneça o valor inteiro inicial do intervalo: ");
            int initialValue = scanner.nextInt();
            System.out.println("Agora forneça o valor inteiro final do intervalo: ");
            int finalValue = scanner.nextInt();

            List<Integer> filteredNumbers =  numbers.stream()
                    .distinct() // Evitar números repetidos
                    .sorted() // Não é necessário, é mais por uma questão visual
                    .filter(number -> number >= initialValue && number <= finalValue) // Intervalo
                    .toList();

            String message = (filteredNumbers.isEmpty())
                    ? "Não foram encontrados números para o intervalo fornecido :/"
                    : "Lista de números entre os números " + initialValue + " e " + finalValue + ": " + filteredNumbers;

            System.out.println(message);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, digite somente valores inteiros.");
        } finally {
            scanner.close(); // Fechar o scanner mesmo que ocorra uma exceção
        }
    }
}
