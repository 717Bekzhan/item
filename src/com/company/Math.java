package com.company;

import java.util.Random;

public class Math implements min {
    Random  random = new Random();
    int[] rNumbers = new int[10];

    @Override
    public int max(int[]array) {
        int maxNum = array[0];
        for (int j : array) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println("max number is : " + maxNum);
        return maxNum;
    }

    @Override
    public int min(int[] array) {
        int minNum = array[0];
        for (int k : array) {
            if (k < minNum) {
                minNum = k;
            }
        }
        System.out.println("min number is : " + minNum);
        return minNum;
    }
    @Override
    public int[] random() {
        for (int i = 0; i < 10; i++) {
           this.rNumbers[i] = random.nextInt(20);
            System.out.print(rNumbers[i]+" ");
        }
        System.out.println();
        return this.rNumbers;
    }
}
