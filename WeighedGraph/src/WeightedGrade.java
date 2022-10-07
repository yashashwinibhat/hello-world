import java.util.*;

public class WeightedGrade {
    private double totalWeightedGrade;
    double totalGrade[] = new double[8];

    public WeightedGrade() {
    }

    public void calculateGrade(List<Integer> pointTotal, List<Double> assignmentPercentage, List<Integer> earnedPoints) {
        for (int i = 0; i < 8; i++) {
            totalWeightedGrade = (earnedPoints.get(i) * assignmentPercentage.get(i)) / (pointTotal.get(i) * 100);
            this.totalGrade[i] = totalWeightedGrade;
        }
    }

    public double calculateTotal() {
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            sum = sum + this.totalGrade[i];
        }
        sum = sum * 100;
        System.out.println(sum + " is the total sum");
        return sum;
    }

    public void generateFinalGrade(double x) {
        if (x >= 90 && x <= 100) {
            System.out.print("A");
        } else if (x >= 80 && x <= 89.9999) {
            System.out.print("B");
        } else if (x < 80 && x >= 70) {
            System.out.print("C");
        } else if (x < 70 && x >= 60) {
            System.out.print("D");
        } else if (x < 60) {
            System.out.print("F");
        }
    }
}
