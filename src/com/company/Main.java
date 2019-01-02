package com.company;

import java.util.Arrays;
import java.util.BitSet;

//print all number of missing numbers in an array
public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 9, 15};
        printNumbers(array, 15);


    }

    public static void printNumbers(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("The total number of missing numbers from the array %s are %d  such as : %n", Arrays.toString(numbers), missingCount);
        int missingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            missingIndex = bitSet.nextClearBit(missingIndex);
            System.out.println(++missingIndex);
        }
    }
}
