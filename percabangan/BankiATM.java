/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BankiATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, uang, saldo;
        saldo = 100000;
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil uang");
        System.out.print("Pilih Menu: ");
        pilih = input.nextInt();
        if (pilih == 1) {
            System.out.print("Jumlah Uang yang anda simpan Rp: " + saldo);
        } else if (pilih == 2) {
            System.out.print("Jumlah Uang yang anda simpan Rp: ");
            uang = input.nextInt();
            saldo += uang;
            System.out.println("Saldo anda adalah: " + (saldo));
        } else if (pilih == 3) {
            System.out.print("Jumlah uang yang anda ambil Rp: " + (saldo));
             uang = input.nextInt();
            if (saldo >= uang) {
            saldo -= uang;
                System.out.println("Saldo anda adalah= " + saldo );
            } else{
                System.out.println("\n saldo anda tidak mencukupi\n");
            }
            
        } else {
            System.out.println("Pilihan Tidak ada");
        }
    }
}
