package com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double nums[] = {1.0, -7.3, 4.3, -2.0, 2.3, -1.2, 3.2, -3.7, 3.4, 2.0, 1.9, -4.1, 0.3, -1.3, 4.0};

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(Arrays.toString(nums));
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    double tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                }


            }
        }



                double sum = 0.0;
                int amount = 0;
                boolean isNegotiv = false;

                for (double num : nums) {
                    if (num < 0) {
                        isNegotiv = true;
                    } else if (isNegotiv) {
                        sum += num;
                        amount++;
                    }
                }
                double averageSum = sum / amount;
                System.out.println("Среднее арифмитическое значение положительних чисел " + averageSum);
            }
}
