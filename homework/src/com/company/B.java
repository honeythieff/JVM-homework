package com.company;

import java.util.Scanner;

public class B  extends A{
    int y;

    public void bOne(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int: ");
        y=scanner.nextInt();
    }
    public int bTwo() {
        return x + y;
    }
}
