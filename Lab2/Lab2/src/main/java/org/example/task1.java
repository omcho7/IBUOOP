package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class task1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            var password = "password";
            while(true){
                System.out.println("Enter your password: ");
                String inputPass = sc.nextLine();
                if (inputPass.equals(password)){
                    System.out.println("The secret message is: cat");
                    break;
                }
        }sc.close();
    }
}