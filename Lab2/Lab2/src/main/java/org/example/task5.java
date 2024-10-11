package org.example;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Enter to what power will the sum be calculated (n): ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int i = 0, sum = 0;
        while(i <= n){
            sum += Math.pow(2,i);
            i++;
        }
        System.out.println(sum);
    }
}
