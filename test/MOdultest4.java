/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class MOdultest4 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int menu, angka;
        System.out.println("1. cek KTP");
        System.out.println("2. Print semangat");
        System.out.println("3. Keluar");
        
        System.out.println("masukkan pilihan anda ====> ");
        menu = in.nextInt();
        
        switch (menu){
            case 1:
                int thn1,
                        thn2;
                System.out.println("seleksi umur pembuatan KTP");
                System.out.println("masukkan tahun lahir: ");
                thn1 = in.nextInt();
                thn2 = 2019-thn1;
                System.out.println("umur anda sekarang adalah " + thn2 +" tahun ");
                
                if (thn2 > 16){
                    System.out.println("anda bisa buat KTP ");
                }
                else {
                    System.out.println("Tidak bisa buat KTP ");
                }
                break;
            case 2:
                System.out.println("masukkan angak (1-10) ");
                
                angka = in.nextInt();
                switch (angka){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("semangat Awal");
                        break;
                    case 5:
                    case 6:
                    case 7:
                        System.out.println("semangat tengah");
                        break; 
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("semangat akhir");
                        break;
                    default:
                        System.out.println("keluar");
                        break;
                        
                }
                
                
                
        }
    }
}
