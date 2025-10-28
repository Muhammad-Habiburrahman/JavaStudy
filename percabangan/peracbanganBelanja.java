package percabangan;

import java.util.Scanner;

public class peracbanganBelanja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kartu;
        int belanja = 0, harga = 0, diskon = 0;

        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t)? ");
        kartu = input.nextLine();

        System.out.print("Berapa total harga barang belanja? Rp ");
        belanja = input.nextInt();

        if (kartu.equals("y")) {
            if (belanja > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else if (kartu.equals("t")) {
            if (belanja > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }
        System.out.println("Total yang harus dibayar : Rp " + (belanja - diskon));
    }
}
