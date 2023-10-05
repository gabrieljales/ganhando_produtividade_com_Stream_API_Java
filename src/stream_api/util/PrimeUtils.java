package stream_api.util;

public class PrimeUtils {
    public static boolean isPrime(int number) {
        // Verifica se o número é menor ou igual a 1, se sim, não é primo
        if (number <= 1) {
            return false;
        }
        // Faz um loop de 2 até a raiz quadrada do número
        for (int i = 2; i * i <= number; i++) {
            // Se o número for divisível por algum valor no intervalo, não é primo
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
