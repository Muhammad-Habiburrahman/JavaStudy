package test;

import java.util.Scanner;

public class Perulangan2Pertemuan6II {

    public static void main(String[] args) {
        String name, pass, passDaftar = "", nameDaftar = "";
        int pilih, harga=0;
        double total = 0;
        boolean regis = true;
        Scanner input = new Scanner(System.in);
        while (regis) {
            System.out.println("===Regsitrasi===");
            System.out.print("Username: ");
            nameDaftar = input.nextLine();
            System.out.print("password: ");
            passDaftar = input.nextLine();
            System.out.println("================");
            if (passDaftar.equalsIgnoreCase("") || nameDaftar.equalsIgnoreCase("")) {
                System.out.println("[isi username & data terlebih dahulu]");
            } else {
                System.out.println("[Registrasi berhasil!!]");
                regis = false;
                System.out.println("===Login===");
                System.out.print("Username: ");
                name = input.nextLine();
                System.out.print("Password: ");
                pass = input.nextLine();
                System.out.println("===========");
                if (passDaftar.equals(pass) && nameDaftar.equals(name)) {
                    System.out.println("Login berhasil!!");
                    do {
                        System.out.println("===Menu Kasir====");
                        System.out.println("1.  Tambah Harga");
                        System.out.println("2.  Lihat Total ");
                        System.out.println("3.  Reset Data");
                        System.out.println("4.  Keluar     ");
                        System.out.println("===============");
                        System.out.print("Pilih menu: ");
                        pilih = input.nextInt();
                        
                        switch(pilih){
                            case 1: System.out.println("Masukkan Harga Barang: ");
                            harga = input.nextInt();
                            harga+=total;
                            break;
                            case 2: System.out.println(harga);
                            break;
                            case 3: 
                                harga=0;
                                System.out.println(harga);
                                break; 
                        }
                        
                    } while (pilih != 4);
                } else {
                    System.out.println("[Password / Username salah]");
                }
            }
        }
    }
}
