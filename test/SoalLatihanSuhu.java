package test;

import java.util.Scanner;

public class SoalLatihanSuhu {

    static void menu() {
        Scanner in = new Scanner(System.in);
        int pilih1, pilih2, nilai;
        double hasil = 0;
        boolean stop = true;
        do {
            System.out.println(">Program Konversi Suhu<");
            System.out.println("-----------------------");
            System.out.println("Pilih suhu yang ingin dikonversi: ");
            System.out.println("1. Celcius  ");
            System.out.println("2. Farenhait");
            System.out.println("3. Reamur   ");
            System.out.println("4. Kelvin   ");
            System.out.println("5. Keluar   ");
            System.out.println("-----------------------");

            System.out.print("Pilih jenis suhu: ");
            pilih1 = in.nextInt();
            if (pilih1 == 5) {
                System.out.println("Terimakasih!!!");
                stop = false;
                break;
            }
            System.out.print("Masukkan nilai suhu: ");
            nilai = in.nextInt();
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println("Pilih tujuan konversi: ");
            System.out.println("1. Ke Celcius   ");
            System.out.println("2. Ke Farenheit ");
            System.out.println("3. Ke Reamur    ");
            System.out.println("4. Ke Kelvin    ");
            System.out.println("-----------------------");
            System.out.print("Pilih jenis suhu      : ");
            pilih2 = in.nextInt();
            System.out.println("-----------------------");
            switch (pilih1) {
                case 1:
                    if (pilih2 == 2) {
                        hasil = cToF(nilai);
                        cToFOutPut(hasil);
                    } else if (pilih2 == 3) {
                        hasil = cToR(nilai);
                        cToROutPut(hasil);
                    } else if (pilih2 == 4) {
                        hasil = cToK(nilai);
                        cToKOutPut(hasil);
                    } else {
                        System.out.println("Tidak ada pilihan!!!");
                    }
                    break;
                case 2:
                    if (pilih2 == 1) {
                        hasil = fToC(nilai);
                        fToCOutPut(hasil);
                    } else if (pilih2 == 2) {
                        hasil = fToR(nilai);
                        fToROutPut(hasil);
                    } else {
                        System.out.println("Tidak ada pilihan!!!");
                    }
                    break;
            }

        } while (stop);
    }

    static double cToF(double c) {
        c = (9.0 / 5.0 * c) + 32;
        return c;
    }

    static void cToFOutPut(double hasil) {
        System.out.println("Hasil konfersi celcius ke farenheit: " + hasil);
    }

    static double cToR(double c) {
        c = 4.0 / 5.0 * c;
        return c;
    }

    static void cToROutPut(double hasil) {
        System.out.println("Hasil konfersi celcius ke Reamur: " + hasil);
    }

    static double cToK(double c) {
        c = c + 273;
        return c;
    }

    static void cToKOutPut(double hasil) {
        System.out.println("Hasil konfersi celcius ke Kelvin: " + hasil);
    }

    static double fToC(double f) {
        f = 5.0 / 9.0 * (f - 32);
        return f;
    }

    static void fToCOutPut(double hasil) {
        System.out.println("Hasil Konfersi Kelvin ke Celcius: " + hasil);
    }

    static void fToKOutPut(double hasil) {
        System.out.println("Tidak ada!");
    }

    static double fToR(double f) {
        f = 4.0 / 9.0 * (f - 32);
        return f;
    }

    static void fToROutPut(double hasil) {
        System.out.println("Hasil Konfersi Kelvin ke Reamur: " + hasil);
    }

    public static void main(String[] args) {
        menu();
    }
}
