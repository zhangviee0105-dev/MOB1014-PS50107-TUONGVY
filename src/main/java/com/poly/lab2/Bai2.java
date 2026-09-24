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
public class Bai2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem Toan: ");
        double toan = sc.nextDouble();

        System.out.print("Nhap diem Ly: ");
        double ly = sc.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double hoa = sc.nextDouble();
        if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10) {
            System.out.println("Diem khong hop le");
            return;
        }
        double dtb = (toan * 2 + ly + hoa) / 4;

        String xepLoai;

        if (dtb >= 8.0) {
            xepLoai = "Gioi";
        } else if (dtb >= 6.5) {
            xepLoai = "Kha";
        } else if (dtb >= 5.0) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }

        System.out.printf("Diem trung binh: %.2f%n", dtb);
        System.out.printf("Xep loai: %s%n", xepLoai);
    }
}

