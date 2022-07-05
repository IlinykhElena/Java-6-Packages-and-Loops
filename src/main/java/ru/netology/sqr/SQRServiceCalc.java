package ru.netology.sqr;

public class SQRServiceCalc {

    public int calcSqrAmount(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}

