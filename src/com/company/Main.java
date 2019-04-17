package com.company;

import java.util.Scanner;

public class Main {
    private static boolean IsPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n.");
        int n = scan.nextInt();
        System.out.println(IsPrime(n)?n+" is prime.": n+" is not prime.");
    }
}
