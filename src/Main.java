
import java.util.function.*;

public class Main {


    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        calc.println.accept(a);
        calc.println.accept(b);

    }


    public static class Calculator {

        static Supplier<Calculator> instance = Calculator::new;

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0; //Программа выдает ошибку "деление на ноль".
        //С помощью тернарного оператора в переменную devide добавлено условие y != 0.
        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
        Predicate<Integer> isPositive = x -> x > 0;
        Consumer<Integer> println = System.out::println;

        public Calculator() {

        }
    }
}










