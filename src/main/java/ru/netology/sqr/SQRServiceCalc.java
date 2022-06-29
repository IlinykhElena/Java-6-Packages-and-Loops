package ru.netology.sqr;

public class SQRServiceCalc {
    int i = 0;

    public int calcSqr(int a, int x) {
        for (a = 10; a <= x; a++) {
            if ((a * a >= 200) && (a * a <= 300)) {
                i++;
            }
        }
        return i;
    }
}

