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
public class pemdaspertama2 {
    public static void main (String[] args){
        int jam, menit, detik, sisaDetik;
        Scanner konversi = new Scanner(System.in);
        
        System.out.println("--Program konversi durasi video--");
        System.out.print("Masukkan toatl durasi dalam detik: ");
        detik = konversi.nextInt();
        jam = detik/3600;
        sisaDetik = detik % 3600;
        menit = sisaDetik/60;
        sisaDetik = sisaDetik % 60;
        
        System.out.println("--Hasil konversi--");
        System.out.println("Durasi: "+jam+"jam"+menit+"menit"+sisaDetik+"Detik");
                
        
    }
}
