package Method;

import java.util.Scanner;

public class Method1I {

    static void regis() {
        Scanner input = new Scanner(System.in);
        String name, pass, passDaftar = "", nameDaftar = "";
        int pilih, harga = 0;
        double total = 0;
        boolean regis = true;

        System.out.println("===Regsitrasi===");
        System.out.print("Username: ");
        nameDaftar = input.nextLine();
        System.out.print("password: ");
        passDaftar = input.nextLine();
        System.out.println("================");
    }

    static void menu() {
        Scanner input = new Scanner(System.in);
        int pilih, harga = 0, total = 0;
        do {
            System.out.println("===Menu Kasir====");
            System.out.println("1. Tambah Harga");
            System.out.println("2. Lihat Total ");
            System.out.println("3. Reset Data");
            System.out.println("4. Keluar ");
            System.out.println("===============");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Harga Barang: ");
                    harga = input.nextInt();
                    harga += total;
                    break;
                case 2:
                    System.out.println(harga);
                    break;
                case 3:
                    harga = 0;
                    System.out.println(harga);
                    break;
            }
        }while (pilih != 4);
    }
     public static void main(String[] args) {
        regis();
        menu();
    }
}
