package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WorkingModeTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testCountRestMonthsCase(int expected, int income, int expenses, int threshold ) {
        WorkingMode freelancer = new WorkingMode();

        int actual = freelancer.calculate(income, expenses, threshold);
       // int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

  //  @Test
  //  public void testCountRestMonthsCase2() {
 //       WorkingMode freelancer = new WorkingMode();

  //      int actual = freelancer.calculate(100_000, 60_000, 150_000);
 //       int expected = 2;

  //      Assertions.assertEquals(expected, actual);
 //   }
}