package com.example.mybudgetapp.models;

public class Saving {
    private double goalAmount;
    private String goalDate;

    public Saving(double goalAmount, String goalDate) {
        this.goalAmount = goalAmount;
        this.goalDate = goalDate;
    }

    public double getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(double goalAmount) {
        this.goalAmount = goalAmount;
    }

    public String getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(String goalDate) {
        this.goalDate = goalDate;
    }
}
