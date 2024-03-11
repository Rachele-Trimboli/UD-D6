package es1;

import java.util.Arrays;

public class LimitiArray {

    int[] numbers;

    public LimitiArray(int[] numbers) {
        this.numbers = numbers;
    }

    public void replaceNumber(int[] array,int position, int number) throws InterException {
        if (position < 0 || position >= numbers.length) {
            throw new InterException(position);
        }

        numbers[position] = number;
        System.out.println(Arrays.toString(numbers));
    }
}
