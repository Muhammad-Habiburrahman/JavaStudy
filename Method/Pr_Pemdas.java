package Method;

import java.util.Scanner;

public class Pr_Pemdas {

    static void menu() {
        Scanner in = new Scanner(System.in);
        String menu = "";
        int pilihan, total, harga = 0, porsi, bayar, kembalian;
        char ulang = 0;
        do {
            System.out.println("----------------------|-------------|");
            System.out.println("| Menu Makanan        |      Harga  |");
            System.out.println("| 1.Ayam Goreng       |  Rp. 10.000 |");
            System.out.println("| 2.Nasi Goreng       |  Rp. 12.000 |");
            System.out.println("| 3.Mie Pangsit       |  Rp. 10.000 |");
            System.out.println("| 4.Pecel Ayam + nasi |  Rp. 15.000 |");
            System.out.println("| 5.Nasi Remes        |  Rp. 8.000  |");
            System.out.println("| 6.Jus Jeruk         |  Rp. 5.000  |");
            System.out.println("| 7.Teh Manis         |  Rp. 2.000  |");
            System.out.println("----------------------|-------------|");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    menu = "Ayam Goreng";
                    harga = 10000;
                    System.out.println("\nAyam Goreng");
                    break;
                case 2:
                    menu = "Nasi Goreng";
                    harga = 12000;
                    System.out.println("\nNasi Goreng");
                    break;
                case 3:
                    menu = "Mie Pangsit";
                    harga = 10000;
                    System.out.println("\nMie Pangsit");
                    break;
                case 4:
                    menu = "Pecel Ayam + Nasi ";
                    harga = 15000;
                    System.out.println("\nPecel Ayam+Nasi");
                    break;
                case 5:
                    menu = "Nasi Remes";
                    harga = 8000;
                    System.out.println("\nNasi Remes");
                    break;
                case 6:
                    menu = "Jus Jeruk";
                    harga = 5000;
                    System.out.println("\nJus Jeruk");
                    break;
                case 7:
                    menu = "Teh Manis";
                    harga = 2000;
                    System.out.println("\nTeh Manis");
                    break;
            }
            System.out.print("Masukkan jumlah porsi: ");
            porsi = in.nextInt();

            total = porsi * harga;
            System.out.print("Total harga  : Rp." + total);

            System.out.print("\nDibayar      : Rp.");
            bayar = in.nextInt();

            kembalian = bayar - total;
            System.out.print("Kembalian    : Rp." + kembalian);

            System.out.print("\n\nMasih ada tambahan Y/T: ");
            ulang = in.next().charAt(0);

        } while (ulang == 'Y' || ulang == 'y');
        System.out.println("Terimakasih!!!");
    }

    public static void main(String[] args) {
        menu();
    }
}
