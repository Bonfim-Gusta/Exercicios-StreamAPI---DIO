package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream().filter(n -> {
            int divisoes = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0){
                    divisoes++;
                }

                if (n == 1){
                    divisoes++;
                }
            }

            return  divisoes == 2;
        }).toList();

        System.out.println(numerosPrimos);
    }
}
