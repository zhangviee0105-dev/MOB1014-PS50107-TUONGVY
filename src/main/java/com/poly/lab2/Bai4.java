/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;

import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Bai4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap so b: ");
        double b = sc.nextDouble();
        System.out.print("nhap phep tinh: ");
        char pheptinh = sc.next().charAt(0);
        switch (pheptinh){
            case '+':
                System.out.printf("%.2f +%.2f=%.2f", a,b,a+b);
                break;
            case '-':
                System.out.printf("%.2f-%.2f=%.2f", a,b,a-b);
                break;
                
        }
    }
    
    
}
