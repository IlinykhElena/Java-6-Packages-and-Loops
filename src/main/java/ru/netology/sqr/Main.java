package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;
        SQRServiceCalc service = new SQRServiceCalc();
        System.out.println("Таких чисел: " + service.calcSqrAmount(min, max));
    }
}
