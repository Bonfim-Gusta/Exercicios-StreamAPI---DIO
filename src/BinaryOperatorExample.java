import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5);

        //BinaryOperator<Integer> somar = (num1 , num2) -> num1 + num2;

        int resultado = numeros.stream().reduce(0, (num1 , num2) -> num1 + num2);

        int result = 0;

        for (Integer n : numeros){
            result += n;
        }

        System.out.println(result);

        System.out.println(resultado);
    }
}
