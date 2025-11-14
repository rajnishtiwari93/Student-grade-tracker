import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter grade for " + name + ": ");
            double grade = sc.nextDouble();
            sc.nextLine(); 
            studentNames.add(name);
            studentGrades.add(grade);
        }  
        double total = 0;
        double highest = studentGrades.get(0);
        double lowest = studentGrades.get(0);

        for (double g : studentGrades) {
            total += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }
        double average = total / n;
        System.out.println("\n===== Grade Summary Report =====");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + " : " + studentGrades.get(i));
        }
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade : " + lowest);
        System.out.println("================================");
        sc.close();
    }
}
