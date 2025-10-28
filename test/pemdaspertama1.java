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
public class pemdaspertama1 {
public static void main(String[] args){
    int minimalSpend, belanja;
    minimalSpend = 200000;
    Scanner input = new Scanner(System.in);
    
    System.out.println("--Program Pengencekan Diskon Berkah Jaya--");
    System.out.print("Masukkan total belanja anda : Rp. ");
    belanja = input.nextInt();
    
    System.out.println("--Status kelayakn diskon--");
    String bonus = belanja >= minimalSpend ? "Selamat anda berhak mendapatkan kupon diskon" : "Terimakasih sudah berbelanja, Tingkatana total belanja anda untuk mendapat diskon.";
    System.out.println(bonus);
    System.out.println("--------------------");
            
    
    

}    
}
