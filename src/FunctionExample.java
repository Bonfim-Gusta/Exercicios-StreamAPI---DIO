import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        //Set<Integer> nums = Set.of(1,2,3,4,5);
        //Map<Integer, Integer> ns = Map.of(1,1,2,2,3,3);
        numeros.add(9);
        numeros.add(10);

        //Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(numero -> numero * 2).toList();

        numerosDobrados.forEach(n -> System.out.println(n + 1));
    }
}
