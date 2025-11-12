package test;

import java.util.Scanner;

public class ModulMethod3 {

    static void info(String nama, int umur) {
        System.out.println("Perkenalkan nama saya " + nama + " umur saya " + umur + " tahun ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        info(nama, umur);
    }
}
