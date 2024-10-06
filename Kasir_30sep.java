/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kasir_30sep;
import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author kinna
 */
public class Kasir_30sep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0, jumlah, total, grandtotal = 0;
        
        do{
            System.out.println("Aplikasi Kasir");
            System.out.println("1. Tas\n2. Sandal\n3. Sepatu");
            System.out.println("4. Selesai");
            System.out.print("Pilih\t: ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.println("Tas (Rp100000)");
                    System.out.print("Masukkan jumlah\t: ");
                    jumlah = input.nextInt();
                    total = 100000*jumlah;
                    grandtotal = grandtotal + total;
                    System.out.println("Total Belanja\t: Rp" + total);
                    break;
                case 2:
                    System.out.println("Sandal (Rp25000)");
                    System.out.print("Masukkan jumlah\t: ");
                    jumlah = input.nextInt();
                    total = 25000*jumlah;
                    grandtotal = grandtotal + total;
                    System.out.println("Total Belanja\t: Rp" + total + "\n");
                    break;
                case 3:
                    System.out.println("Sepatu (Rp120000)");
                    System.out.print("Masukkan jumlah\t: ");
                    jumlah = input.nextInt();
                    total = 120000*jumlah;
                    grandtotal = grandtotal + total;
                    System.out.println("Total Belanja\t: Rp" + total);
                    break;
                case 4:
                    System.out.println("Grand total\t: Rp" + grandtotal);
                    System.out.println("Terimakasih sudah menggunakan aplikasi kasir!");
                    break;
                default:
                    System.out.println("Pilihan Salah!");
            }
        } while(pilih != 4);
    }
}
