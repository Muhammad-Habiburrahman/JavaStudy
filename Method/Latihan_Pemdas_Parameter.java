package Method;

import java.util.Scanner;

public class Latihan_Pemdas_Parameter {

    public static double hitungDiskon(double totalBelanja) {
        double diskon;
        if (totalBelanja > 500000) {
            diskon = (totalBelanja * 15) / 100;
        } else if (totalBelanja > 250000) {
            diskon = (totalBelanja * 10) / 100;
        } else {
            diskon = (totalBelanja * 5) / 100;
        }
        return diskon;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("== Sistem Diskon ==");
        System.out.print("Masukkan Total belanja: Rp.");
        double totalBelanja = in.nextDouble();
        if (totalBelanja > 500000) {
            System.out.println("Harga yang dibayar: Rp." + (totalBelanja - hitungDiskon(totalBelanja)));
        } else if (totalBelanja > 250000) {
            System.out.println("Harga yang dibayar: Rp." + (totalBelanja - hitungDiskon(totalBelanja)));
        } else if (totalBelanja <= 250000) {
            System.out.println("Harga yang dibayar: Rp." + (totalBelanja - hitungDiskon(totalBelanja)));
        }
    }
}
