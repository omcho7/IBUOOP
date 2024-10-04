import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second number: ");
        double b = Double.parseDouble(sc.nextLine());
        if (a == b)  System.out.println("The numbers are equal.");
        else if (a < b) System.out.println("Number " + a + " is less than " + b + ".");
        else System.out.println("Number " + a + " is greater than " + b + ".");
    }
}
