package com.company;

import java.util.Scanner;

public class A {
    static int x;
    public A(){
        System.out.println("Hello");
    }
    public void one(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int :");
        x=scanner.nextInt();
    }

    public void two(){
        int addTwelve;
        addTwelve = x+12;
        System.out.println(addTwelve);
    }
    public void three(){
        if (x % 2 == 0){
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }
}
