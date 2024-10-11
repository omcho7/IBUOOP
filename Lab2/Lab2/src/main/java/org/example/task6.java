package org.example;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        
        System.out.println("How many times do you want the text to be printed?");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printText(n);
    }

    public static void printText(int n){
        for(int i = 0; i < n; i++){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
}

