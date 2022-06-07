package ru.netology.Statistic.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    private static final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void testYearRevenue() {
        StatsService service = new StatsService();

        int expected = 180;

        int actual = service.getYearRevenue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testAverageMonthlySales() {
        StatsService service = new StatsService();
        double expected = 15;

        double actual = service.getAverageMonthlySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMaxMonthSales() {
        StatsService service = new StatsService();
        int expected = 8;

        int actual = service.getLastMaxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMinMonthSales() {
        StatsService service = new StatsService();
        int expected = 9;

        int actual = service.getLastMinMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMonthsAmountWithSalesLowerAverage() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.getCountMonthsWithSalesLowerAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMonthsAmountWithSalesHigherAverage() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.getCountMonthsWithSalesHigherAverage(sales);

        assertEquals(expected, actual);
    }
}