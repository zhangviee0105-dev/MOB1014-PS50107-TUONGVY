/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.llab1;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class hinhchunhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai hình chu nhat: ");
        double dai = sc.nextDouble();
        System.out.print("chieu rong hinh chu nhat: ");
        double rong = sc.nextDouble();
        double dienTich = dai*rong;
        double chuVi = (dai+rong)*2;
        System.out.printf("Dien tich hinh chu nhat = %.2f%n",  dienTich);
        System.out.printf("Chu vi hinh chu nhat= %.2f%n", chuVi);
        
        
        
        
    }
    
    
}
