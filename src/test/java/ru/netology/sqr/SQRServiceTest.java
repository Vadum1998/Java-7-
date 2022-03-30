package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"Min limit values ,100,100,1",
            "Max values ,9800,9802,1",
            "Averages values,5000,6000,7",
            "No min values,0,99,0",
            "No max values,9802,9000,0",
            "Maximum number of values,100,9801,90"})
    void calculateCvadrat(String testName, int lowlimit, int uplimit, int actual) {
        SQRService calculate = new SQRService(); // подготавливаем данные
        int currentCounter = calculate.calculateCvadrat(lowlimit, uplimit); // вызываем целевой метод
        assertEquals(currentCounter, actual);
        // сравниваем ожидаемый и фактический

    }
}