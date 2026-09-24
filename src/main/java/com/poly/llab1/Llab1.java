/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.llab1;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Llab1 {

    public static void main(String[] args) {
        String hoTen;
        int namSinh;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("nhap nam sinh: ");
        namSinh = scanner.nextInt();
        System.out.printf("chao %s. Nam nay %d tuoi.", hoTen,2026 - namSinh);
    }

}
