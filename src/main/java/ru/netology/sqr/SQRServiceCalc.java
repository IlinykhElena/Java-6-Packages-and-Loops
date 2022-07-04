package ru.netology.sqr;

public class SQRServiceCalc {

    public int calcSqrAmount(int a, int x) {
        int count = 0;
        for (a = 10; a <= x; a++) {
            if ((a * a >= 200) && (a * a <= 300)) {
                count++;
            }
        }
        return count;
    }
}

