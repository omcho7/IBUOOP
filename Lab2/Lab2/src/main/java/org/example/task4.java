package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = 0;
        if(a > b) {
            while(b < a){
                System.out.println(b);
                b++;
            }
        }
        else{
            while(a < b){
                System.out.println(a);
                a++;
            }
        }

    }
}
