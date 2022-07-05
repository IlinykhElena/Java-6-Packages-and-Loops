package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceCalcTest {

    @Test
    public void shouldCalcCorrectLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 3;
        int actual = service.calcSqrAmount(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUnderLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 0;
        int actual = service.calcSqrAmount(200, 210);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOverLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 3;
        int actual = service.calcSqrAmount(300, 400);

        Assertions.assertEquals(expected, actual);
    }
}
