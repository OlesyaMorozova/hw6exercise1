package ru.netology.hw6exercise1.hw6exercise1.stats;

public class StatsService {
    public long getSalesAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long getAverageAmount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / sales.length;
    }

    public int getTheMonthOfMaximumSales(long[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int getTheMonthOfMinimumSales(long[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
        int belowTheAverage = 0;
        long average = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowTheAverage++;
            }
        }
        return belowTheAverage;
    }

    public int getMonthsAboveAverage(long[] sales) {
        int aboveTheAverage = 0;
        long average = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveTheAverage++;
            }
        }
        return aboveTheAverage;
    }
}