package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosNumerosDistintos = numeros.stream().allMatch(n -> {
            int q = 0;
            for (int num : numeros){
                if (num == n){
                    q++;
                }
            }

            return q == 1;
        });

        System.out.println(todosNumerosDistintos);

    }
}
