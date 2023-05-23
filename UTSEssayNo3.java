/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritma.dan.pemrograman.ii;

import java.util.Scanner;
/**
 *
 * @author aryay
 */
public class UTSEssayNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nama: Arya Yusuf Karan
        //NPM: 227064516066
        int kategori;
        int jumlahtiket;
        int harga=0;
        int jumlahpembayaran;
        int kembalian;
        Scanner keyboard=new Scanner(System.in);

        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");


        System.out.println("Kategori tiket yang tersedia");
        System.out.println("1. Category 1 (Rp5.000.000)");
        System.out.println("2. Category 2 (Rp4.000.000)");
        System.out.println("3. Category 3 (Rp3.250.000)");
        System.out.println("4. Category 4 (Rp2.500.000)");

        System.out.print("Pilih kategori tiket (1-4): ");
        kategori=keyboard.nextInt();

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahtiket=keyboard.nextInt();

        switch (kategori) {
            case 1:
                harga=5000000*jumlahtiket;
                break;
            case 2:
                harga=4000000*jumlahtiket;
                break;
            case 3:
                harga=3250000*jumlahtiket;
                break;
            case 4:
                harga=2500000*jumlahtiket;
                break;
            default:
                harga=0;
                break;
        }

        System.out.println("==================================================");
        System.out.println("                  INVOICE PEMBELIAN                 ");
        System.out.println("==================================================");
        System.out.println("Kategori Tiket: Category " + kategori);
        System.out.println("Jumlah Tiket  : " + jumlahtiket);
        System.out.println("Harga Tiket   : Rp. " + harga);
        System.out.println("==================================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        jumlahpembayaran=keyboard.nextInt();

        kembalian=jumlahpembayaran-harga;

        System.out.println("Kembalian: Rp. " + kembalian);
        System.out.println("==================================================");
    }
    
}
