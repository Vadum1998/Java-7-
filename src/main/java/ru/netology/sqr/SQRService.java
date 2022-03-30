package ru.netology.sqr;

public class SQRService {
    public int calculateCvadrat(int lowLimit, int upLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;
            if (lowLimit <= j && j <= upLimit) {
                count = count + 1;
            }
        }
        return count;
    }
}