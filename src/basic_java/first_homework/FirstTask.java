package basic_java.first_homework;

import java.util.Arrays;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[7];
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
        }
        System.out.println("First array : " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = zero;
            }
        }
        System.out.println("Array after update : " + Arrays.toString(array));
    }
}