package Desafios;

import java.util.*;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdemSemOMaior = new ArrayList<>(numeros.stream().sorted().toList());
        numerosEmOrdemSemOMaior.removeLast();
        int segundoMaior = numerosEmOrdemSemOMaior.stream().toList().getLast();

        System.out.println(segundoMaior);
    }
}
