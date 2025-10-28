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
public class PraktikumPemdasIV {
    public static void main (String[] args){
     Scanner input = new Scanner (System.in);
    int pilihan, harga;
    String kelas;
    
        System.out.println("Pilih jenis tiket: ");
        System.out.println("1 = Ekonomi ");
        System.out.println("2 = Reguler ");
        System.out.println("3 = VIP ");
        System.out.println("4 = VVIP ");
        
        System.out.print("Masukkan pilihan: ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                kelas = "Ekonomi";
                harga =  30000;
                System.out.println("Anda memilih tiket "+kelas+","+"Harga Rp"+harga);
                break;
            case 2:
                kelas = "Reguler";
                harga = 50000;
                System.out.println("Anda memilih tiket "+kelas+","+"Harga Rp"+harga);
                break;
            case 3:
                kelas = "VIP";
                harga = 75000;
                System.out.println("Anda memilih tiket "+kelas+","+"Harga Rp"+harga);
                break;
            case 4:
                kelas = "VVIP";
                harga = 100000;
                System.out.println("Anda memilih tiket "+kelas+","+"Harga Rp"+harga);
                break;
            default :
                System.out.println("Jenis tiket tidak valid");
                        
        }
                
        
    }       
}
