/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritma.dan.pemrograman.ii;

//Mengimport utility scanner untuk mengambil input an dari user
import java.util.Scanner;
/**
 *
 * @author aryay
 */
public class UTSEssayNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nama: Arya Yusuf Karan
        //NPM: 227064516066
        int menu;
        char pilihan='N';
        //Membuat objek Scanner untuk membaca input dari pengguna
        Scanner keyboard=new java.util.Scanner(System.in);
        
        //Pengulangan untuk kembali ke menu utama
        do{
        //Menampilkan output menu utama
        System.out.println("Daftar Nama-Nama Hewan Berdasarkan Jenis Makanannya");
        System.out.println("==============================");
        System.out.println("1. Omnivora");
        System.out.println("2. Herbivora");
        System.out.println("3. Karnivora");
        System.out.print("Pilih daftar yang diinginkan: ");
        menu=keyboard.nextInt();
        System.out.println();
        
        //Menampilkan daftar nama-nama hewan sesuai menu yang telah dipilih
        switch(menu){
            case 1:
                System.out.println("Daftar Nama-Nama Hewan Omnivora");
                System.out.println("==============================");
                System.out.println("1. Ayam             2. Babi");
                System.out.println("3. Bebek            4. Beruang Hitam");
                System.out.println("5. Burung Gagak     6. Burung Jalak");
            break;
            
            case 2:
                System.out.println("Daftar Nama-Nama Hewan Herbivora");
                System.out.println("==============================");
                System.out.println("1. Sapi             2. Kambing");
                System.out.println("3. Kuda             4. Gajah");
                System.out.println("5. Jerapah          6. Kapibara");
            break;
            
            case 3:
                System.out.println("Daftar Nama-Nama Hewan Karnivora");
                System.out.println("==============================");
                System.out.println("1. Burung Elang     2. Burung Hantu");
                System.out.println("3. Harimau          4. Singa");
                System.out.println("5. Komodo           6. Buaya");
            break;
            
            default:
                System.out.println("Daftar yang anda pilih tidak ada");
            break;
        }
        
        System.out.println("Apakah anda ingin keluar?");
        System.out.print("Jawaban (Y/N): ");
        pilihan=keyboard.next().charAt(0);
    }
        
        while (pilihan=='N');
    
}
    
}
