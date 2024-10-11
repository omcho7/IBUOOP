package org.example;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        System.out.println("Enter number of rows of pyramid:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        drawStarsPyramid(n);
    }

    public static void drawStarsPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>i-1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
