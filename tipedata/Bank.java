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
public class Bank {

    public static void main(String[] args) {
        int saldo, uang;
        saldo = 100000;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selamat datang di Bank Unan/n Saldo saat ini: RP." + saldo);
        System.out.print("Simpan uang : Rp. ");
        uang = keyboard.nextInt();
        saldo = saldo + uang;
        System.out.print("saldo saat ini: Rp. " + saldo);

    }

}
