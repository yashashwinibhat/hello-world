package com.swingapp;

public class WeightedGrade {
    private int pointTotal;
    private int earnedPoints;
    // double date type for precision
    private double assignmentPercentage;
    private double totalWeightedGrade;

    /**
     * constructor for the class with no parameters
     */
    public WeightedGrade() {}

    public WeightedGrade(int pointTotal, int earnedPoints, double assignmentPercentage) {
        this.pointTotal = pointTotal;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
    }

    public void calculateGrade(int pointTotal, int earnedPoints, double assignmentPercentage) {
        double val = assignmentPercentage/100;
        totalWeightedGrade = ((earnedPoints * val) / pointTotal)*100;
    }

    public double getGrade() {
        return totalWeightedGrade;
    }
}
