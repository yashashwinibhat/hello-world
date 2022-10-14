import java.util.*;

public class WeightedGrade4 {
    private double totalWeightedGrade;
    List<Double> totalGrade = new ArrayList<>();

    public WeightedGrade4() {
    }

    public void calculateGrade(List<Integer> pointTotal, List<Double> assignmentPercentage, List<Integer> earnedPoints, int n) {
        for (int i = 0; i < n; i++) {
            totalWeightedGrade = (earnedPoints.get(i) * assignmentPercentage.get(i)) / (pointTotal.get(i) * 100);
            totalGrade.add(totalWeightedGrade);
        }
    }

    public double calculateTotal(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + totalGrade.get(i);
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
