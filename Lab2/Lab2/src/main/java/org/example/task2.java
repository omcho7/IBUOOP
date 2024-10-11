package org.example;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int sum = 0;
        for(int i=1; i<=3; i++){
            int x = Integer.parseInt(sc.nextLine());
            sum += x;
        }
        System.out.println("The sum is: " + sum);
    }
}
