package basicYf;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] numbers = {5,900,1,5,77,30,64,700};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
