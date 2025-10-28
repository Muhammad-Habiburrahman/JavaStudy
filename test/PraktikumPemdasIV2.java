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
public class PraktikumPemdasIV2 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int pilihan; 
        double sisi, luas, panjang, alas, r, lebar = 0,tinggi;
        String bangun;
        
        System.out.println("Pilih bangun datar: ");
        System.out.println("1 = Persegi ");
        System.out.println("2 = Persegi panjang ");
        System.out.println("3 = Segitiga ");
        System.out.println("4 = Lingkaran ");
        
        System.out.print("Masukkan pilihan: ");
        pilihan = input.nextInt();
        
        
        switch (pilihan){
            case 1:
                System.out.print("Masukkan sisi: ");
                sisi = input.nextInt();
                bangun = "Persegi";
                luas = sisi*sisi;
                System.out.println("Luas persegi= "+luas);
                break;
            case 2:
                System.out.print("Masukkan Panjang: ");
                panjang = input.nextInt();
                System.out.print("Masukkan Lebar: ");
                lebar = input.nextInt();
                bangun = "Persegi panjang";
                luas = panjang*lebar;
                System.out.println("Luas persegi panjang = "+luas);
                break;
            case 3:
                System.out.print("Masukkan alas: ");
                alas = input.nextInt();
                System.out.print("masukkan tinggi: ");
                tinggi = input.nextInt();
                bangun = "Segitiga";
                luas = alas*tinggi/2;
                System.out.println("Luas Segitiga = "+luas);
                break;
            case 4:
                System.out.print("Masukkan r: ");
                r = input.nextInt();
                bangun ="Lingkaran";
                luas = 3.14*r*r;
                System.out.println("Luas lingkaran= "+luas);
                break; 
            default :
                System.out.println("Bangun tidak tersedia");
        }
    }
}
