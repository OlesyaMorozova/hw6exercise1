package ru.netology.hw6exercise1.hw6exercise1.stats;

public class StatsService {
    public int getSalesAmount (int [] sales) {
        int sum = 0;
        for(int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAverageAmount (int [] sales) {
        int sum = 0;
        for(int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / sales.length;
    }

    public int getTheMonthOfMaximumSales (int [] sales) {
        int monthMaxSales = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales [monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int getTheMonthOfMinimumSales (int [] sales) {
        int monthMinSales = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int getMonthsBelowAverage (int [] sales) {
        int belowTheAverage = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageAmount (sales)) {
                belowTheAverage++;
            }
        }
        return belowTheAverage;
    }

    public int getMonthsAboveAverage (int [] sales) {
        int aboveTheAverage = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageAmount (sales)) {
                aboveTheAverage++;
            }
        }
        return aboveTheAverage;
    }
}