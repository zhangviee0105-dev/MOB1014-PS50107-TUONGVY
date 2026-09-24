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
public class Bai3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();
        switch(thang){
            case 1,2,3:
                System.out.printf("mua xuan");
                break;
            case 4,5,6:
                System.out.printf("mua ha");
                break;
            case 7,8,9:
                System.out.printf("mua thu", thang);
                break;
            case 10, 11,12:
                System.out.printf("mua dong", thang);
                break;
            default:
                System.out.printf("thang khong hop le");
                break;
                
        }
                
        
    }
    
}
