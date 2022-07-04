package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceCalcTest {

    @Test
    public void shouldCalcCorrectLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 3;
        int actual = service.calcSqrAmount(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUnderLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 0;
        int actual = service.calcSqrAmount(0, 9);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOverLimit() {
        SQRServiceCalc service = new SQRServiceCalc();

        int expected = 3;
        int actual = service.calcSqrAmount(10, 200);

        Assertions.assertEquals(expected, actual);
    }
}
