package ru.netology.hw6exercise1.hw6exercise1.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getAverageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfTheMonthOfMaximumSales() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getTheMonthOfMaximumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfTheMonthOfMinimumSales() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getTheMonthOfMinimumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsWithSalesAboveAverage () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
