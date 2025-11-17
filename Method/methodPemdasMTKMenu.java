package Method;

import java.util.Scanner;

public class methodPemdasMTKMenu {

    static Scanner in = new Scanner(System.in);

    static void luasPersegi() {
        int panjang = 0, lebar = 0;
        System.out.print("Panjang = ");
        panjang = in.nextInt();
        System.out.print("Lebar = ");
        lebar = in.nextInt();
        System.out.println("Luas persgei panjang nya adalah =" + (panjang * lebar));
        System.out.println("");
    }

    static void luasKelilingPersegi() {
        System.out.print("Sisi= ");
        int sisi = in.nextInt();
        System.out.println("Keliling nya adalah = " + (sisi * sisi));
        System.out.println("");
    }

    static void LuasSegitiga() {
        int luas, alas = 0, tinggi = 0;
        System.out.print("alas= ");
        alas = in.nextInt();
        System.out.print("tinggi= ");
        tinggi = in.nextInt();
        System.out.println("Luas nya adalah= " + (alas * tinggi / 2));
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Perhitungan Matematika: ");
            System.out.println("1. Luas persegi panjang");
            System.out.println("2. Luas keliling persegi");
            System.out.println("3. Luas segitiga");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    luasPersegi();
                    break;
                case 2:
                    luasKelilingPersegi();
                    break;
                case 3:
                    LuasSegitiga();
                    break;
            }
        } while (pilih != 4);
    }

}
