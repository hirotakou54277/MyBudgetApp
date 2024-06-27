package com.example.mybudgetapp.models;

public class Forecast {
    private double dailyUsableAmount;
    private double weeklyUsableAmount;
    private double monthlyUsableAmount;

    public Forecast(double dailyUsableAmount, double weeklyUsableAmount, double monthlyUsableAmount) {
        this.dailyUsableAmount = dailyUsableAmount;
        this.weeklyUsableAmount = weeklyUsableAmount;
        this.monthlyUsableAmount = monthlyUsableAmount;
    }

    public double getDailyUsableAmount() {
        return dailyUsableAmount;
    }

    public void setDailyUsableAmount(double dailyUsableAmount) {
        this.dailyUsableAmount = dailyUsableAmount;
    }

    public double getWeeklyUsableAmount() {
        return weeklyUsableAmount;
    }

    public void setWeeklyUsableAmount(double weeklyUsableAmount) {
        this.weeklyUsableAmount = weeklyUsableAmount;
    }

    public double getMonthlyUsableAmount() {
        return monthlyUsableAmount;
    }

    public void setMonthlyUsableAmount(double monthlyUsableAmount) {
        this.monthlyUsableAmount = monthlyUsableAmount;
    }
}
