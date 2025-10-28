/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class luassegitigaIO {
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        
        System.out.print("Masukan Alas= ");
        double Alas = masukan.nextDouble(); 
        System.out.print("Masukkan Tinggi= ");
        double Tinggi = masukan.nextDouble();
        double Luassegitiga = Alas*Tinggi*0.5;

        System.out.println("Jadi, Luas Segitiga adalah= " + Luassegitiga);
    }
}
