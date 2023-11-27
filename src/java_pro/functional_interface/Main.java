/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package java_pro.functional_interface;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> function1 = (str) -> str.length();
        int number = function1.apply("Hello");
        System.out.println(number);

        BinaryOperator<String> function2 = (str1, str2) -> str1 + str2;
        String first = function2.apply("Hello ", "World!");
        System.out.println(first);

        Supplier<Integer> function3 = () -> new Random().nextInt(100);
        int randomNumber = function3.get();
        System.out.println(randomNumber);

        Consumer<Integer> function4 = (repeat) -> {

            for (int i = 0; i < repeat; i++) {
                System.out.println("привет");
            }
        };
        function4.accept(10);
    }
}