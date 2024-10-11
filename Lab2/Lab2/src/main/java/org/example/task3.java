package org.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int sum = 0;
        while(x != 0){
            System.out.println("Enter a number");
            x = sc.nextInt();
            sum += x;

        }
        System.out.println("The sum is: " + sum);
    }
}
