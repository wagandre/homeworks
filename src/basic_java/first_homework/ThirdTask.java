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
public class ThirdTask {

    public static void main(String[] args) {

        int[] result = printNumbersWithZero(5);
        System.out.println(Arrays.toString(result));
    }

    public static int[] printNumbersWithZero(int N) {
        Random random = new Random();

        int[] sequence = new int[N];
        boolean containsZero = false;
        for (int i = 0; i < N; i++) {
            sequence[i] = random.nextInt(0, 10);
            if (sequence[i] == 0) {
                containsZero = true;
            }
        }
        if (containsZero) {
            System.out.println("This array contains zero");
        } else {
            System.out.println("There is no zero in the array");
        }

        return sequence;
    }
}
