package com.company;

import java.util.Scanner;

public class C {

    int a, b, c;

    public void one() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int: ");
        a = scanner.nextInt();

        System.out.println("Enter int: ");
        b = scanner.nextInt();

        System.out.println("Enter int: ");
        c = scanner.nextInt();

    }
    public int two() {
        return a % 10;
    }
    public int three() {
        while (b>=10){
        b /=10;
        }
        return b;
    }
    public int four(){
        int sum = 0;
        while (c>0){
            sum+= c % 10;
            c/=10;
        }
        return sum;
    }
    public void five(){
        int product = two() * three();
        System.out.println(product);
    }
    public void six() {
        int sum= three() + (two() * three());
        System.out.println(sum);
    }
}
