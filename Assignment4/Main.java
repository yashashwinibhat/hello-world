import java.util.*;

public class Main {
    public static void main(String[] args) {
        WeightedGrade4 wg = new WeightedGrade4(); //create an object of class WeightGrade

        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>(); //create 3 arraylist to store all the 8 scores from user in each list
        List<Double> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        System.out.println("Enter the Total no of grades ");
        String user_input = scanner.nextLine();
        int n = Integer.parseInt(user_input);

        System.out.println("Enter the Total possible points p1: ");
        String user_input1 = scanner.nextLine();

        String[] stringsArray1 = user_input1.split(",");
        for (String s : stringsArray1) {
            try{
                list1.add(Integer.parseInt(s));
            }catch(NumberFormatException ne){
                System.out.println("Input is not a int value");
                return;
            }
        }

        System.out.println("Enter the user percentage %  ");
        String user_input2 = scanner.nextLine();
        String[] stringsArray2 = user_input2.split(",");
        for (String s : stringsArray2) {
            try {
                list2.add(Double.parseDouble(s));
            }catch(NumberFormatException ne) {
                System.out.println("Input is not a double value");
                System.exit(0);
            }
        }

        System.out.println("Enter the Earned Scores s1:");
        String user_input3 = scanner.nextLine();
        String[] stringsArray3 = user_input3.split(",");
        for (String s : stringsArray3) {
            try {
                list3.add(Integer.parseInt(s));
            }catch(NumberFormatException ne){
                System.out.println("Input is not a int value");
                System.exit(0);
            }
        }

        wg.calculateGrade(list1, list2, list3,n);    //calculates the total weighted grade and stores in array
        double result = wg.calculateTotal(n);      //add array elements to calculate the total and multiply by 100
        wg.generateFinalGrade(result);            //pass result to obtain the grade
    }
}

