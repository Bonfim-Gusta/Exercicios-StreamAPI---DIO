import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8);

//        numeros.forEach(n -> {
//            if (n % 2 == 0) {
//                System.out.println(n);
//            }
//        });

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
