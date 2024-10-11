package org.example;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        System.out.println("Enter number of rows of pyramid:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        drawStarsPyramid(n);
    }

    public static void drawStarsPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
