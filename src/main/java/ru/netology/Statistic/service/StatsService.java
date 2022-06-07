package ru.netology.Statistic.service;

public class StatsService {

    public int getYearRevenue(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }
    public double getAverageMonthlySales(int[] sales)  {
        return Math.round(getYearRevenue(sales) * 100.0 / sales.length) / 100.0;
    }
    public int getLastMaxMonthSales(int[] sales) {
        int currentMaxSalesMonth = 0;
        int currentMax = sales[0];
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] >= currentMax) {
                currentMax = sales[i] ;
                currentMaxSalesMonth = i;
            }
        }
        return currentMaxSalesMonth + 1;
    }
    public int getLastMinMonthSales(int[] sales) {
        int currentMinSalesMonth = 0;
        int currentMin = sales[0];
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] <= currentMin) {
                currentMin = sales[i];
                currentMinSalesMonth = i;
            }
        }
        return currentMinSalesMonth + 1;
    }
    public int getCountMonthsWithSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        double averageMonthlySales = getAverageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale < averageMonthlySales) {
                monthsAmount++;
            }
        }
        return monthsAmount;
    }
    public int getCountMonthsWithSalesHigherAverage(int[] sales) {
        int monthsAmount = 0;
        double averageMonthlySales = getAverageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale > averageMonthlySales) {
                monthsAmount++;
            }
        }
        return monthsAmount;
    }
}
