package com;

public class Main {

    public static void main(String[] args) {
        double nums [] = {1.0, -7.3, 9.3, -2.0, 2.3, -1.2, 5.2, -3.7, 3.4, 2.0, 1.9, -9.1, 0.3, -1.3, 4.0};
        double result=0;
        for (double d:nums ) {
            result += d;
        }
        System.out.println("Среднее арифмитическое значение " + result / nums.length);
    }

}
