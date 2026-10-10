/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author TUONG VY
 */
public class Săpxepphantu {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
          for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("nhap gia tri x: ");
        int x = sc.nextInt();
        int[] b = Arrays.copyOf(a, a.length);
        
        boolean timThay = false;
        System.out.print("Vi tri cua "+x+" trong mang");
        for (int i =0; i<n;i++){
            if (a[i] ==x){
                System.out.print(i +" ");
                timThay = true;
            }
        }
        if (timThay == false){
            System.out.print("khong tim thay nhen");
        }
        
        for (int i =0;i<n-1;i++){
            for (int j=0; j<n-1-i; j++){
                if (a[j]< a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                }
            }
        }
        System.out.println();
        System.out.printf("Mang giam dan: %s\n", Arrays.toString(a));
        Arrays.sort(b);
        System.out.printf("Mang tang dan: %s\n", Arrays.toString(b));
        
    }
    
    
}
