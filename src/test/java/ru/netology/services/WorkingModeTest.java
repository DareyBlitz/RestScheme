package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkingModeTest {
    @Test
    public void testCountRestMonthsCase1() {
        WorkingMode freelancer = new WorkingMode();

        int actual = freelancer.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountRestMonthsCase2() {
        WorkingMode freelancer = new WorkingMode();

        int actual = freelancer.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}