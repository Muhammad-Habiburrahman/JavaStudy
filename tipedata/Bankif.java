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
public class Bankif {
       public static void main(String[] args) {
        int saldo, uang;
        int sisaSaldo;
        saldo = 100000;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selamat datang di Bank Unan/n Saldo saat ini: RP." + saldo);
        System.out.print("Ambil uang : Rp. ");
        uang = keyboard.nextInt();
        saldo = saldo - uang;
        System.out.print("Sisa uang: Rp. " + saldo);
        if (saldo <= 100000){
            sisaSaldo = uang - saldo;
        }
        else{
            System.out.println("ero");;   
        }
    }
}
