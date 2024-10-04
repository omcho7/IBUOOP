import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = Double.parseDouble(sc.nextLine());
        if (number == 0){
            System.out.println("The number is zero.");
        }
        else if (number < 0){
            System.out.println("The number is negative.");
        }
        else System.out.println("The number is positive.");
    }
}
