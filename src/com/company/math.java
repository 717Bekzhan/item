package com.company;

import com.company.max.min;

import java.util.Map;
import java.util.Random;

public class math implements min {
    Random random = new Random(20);
    int numbers[] = new int[]{10, 22, 330, 90, 8};

    @Override
    public void max() {
        int maxNum = numbers[0];
        for (int j : numbers) {
            if (j > maxNum) {
                maxNum = j;

            }
        }
        System.out.println("max number is : " + maxNum);
    }

    @Override
    public void min() {
        int minNum = numbers[0];
        for (int k : numbers) {
            if (k < minNum) {
            }
        }
        System.out.println("min number is : " + minNum);
    }


    @Override
    public void random() {
        int san = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.println(array[i]);
            array[i] = san;
        }
        System.out.println(san);
    }
}
