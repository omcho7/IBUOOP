
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first integer: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Type the second integer: ");
        int num2 = Integer.parseInt(sc.nextLine());
        int result = num1 + num2;
        System.out.println("The sum of the two integres is: " + result + ".");
    }
}
