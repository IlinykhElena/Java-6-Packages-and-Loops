package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int low = 10;
        int high = 99;
        SQRServiceCalc service = new SQRServiceCalc();
        System.out.println("Таких чисел: " + service.calcSqr(low, high));
    }
}
