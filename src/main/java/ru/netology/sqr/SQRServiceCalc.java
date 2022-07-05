package ru.netology.sqr;

public class SQRServiceCalc {

    public int calcSqrAmount(int numeralFromScope, int maxNumber) {
        int count = 0;
        for (numeralFromScope = 10; numeralFromScope <= maxNumber; numeralFromScope++) {
            if ((numeralFromScope * numeralFromScope >= 200) && (numeralFromScope * numeralFromScope <= 300)) {
                count++;
            }
        }
        return count;
    }
}

