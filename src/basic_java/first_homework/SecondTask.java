/* © Copyright iFD GmbH 2023 www.ifd-gmbh.com */
package basic_java.first_homework;

import java.util.Arrays;
import java.util.Random;

/**
 * TODO (AWA) Beschreibung der Klasse ...
 *
 * @author AWA
 * @author iFD GmbH
 */
public class SecondTask {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[5];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arrays));

        boolean isIncreasing = true;

        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] >= arrays[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else
            System.out.println("Массив не является строго возрастающей последовательностью.");
    }
}