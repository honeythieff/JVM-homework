package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//    C c =new C();
//    c.one();
//        System.out.println(c.two());
//        System.out.println(c.three());
//        System.out.println(c.four());
//        c.five();
//        c.six();

//        A a =new A();
//        a.one();
//        a.two();
//        a.three();

//        B b = new B();
//        b.bOne();
//        b.bTwo();
//        System.out.println(b.bTwo());


        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        int[] rArray = new int[40];
        int min, max;
        Random random = new Random();

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        for (int i = 0; i < 40; i++) {
            rArray[i] = random.nextInt(max - min + 1) + min;

        }
        System.out.println(Arrays.toString(rArray)); //40 რიცხვიანი მასივის ბეჭდვა

        int totalEven = 0;

        for (int num : rArray) {
            if (num % 2 == 0) {
                totalEven += 1;
            }
        }
        System.out.println(totalEven); //ლუწი რიცხვების რაოდენობის ბეჭდვა

        int totalOdd;
        totalOdd = rArray.length - totalEven;
        System.out.println(totalOdd); //კენტი რიცხვების რაოდენობის ბეჭდვა

        int sumEven = 0;
        int sumOdd = 0;

        for (int num : rArray) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println(sumEven);//ლუწი რიცხვების ჯამის ბეჭდვა
        System.out.println(sumOdd);//კენტი რიცხვების ჯამის ბეჭდვა

        if (sumEven < sumOdd) {
            min = sumEven;
            max = sumOdd;
        } else {
            min = sumOdd;
            max = sumEven;

        }

        //5 შემთხვევითი რიცხვი ჯამებს შორის
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(max - min + 1) + min);
        }


    }
}

