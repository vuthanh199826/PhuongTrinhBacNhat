package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ax +b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a vao day");
        int a = sc.nextInt();
        System.out.println("nhap b vao day");
        int b = sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so ngiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }else {
            System.out.println("phuong trinh co nghiem la: " + (double)b/a);
        }
    }
}
