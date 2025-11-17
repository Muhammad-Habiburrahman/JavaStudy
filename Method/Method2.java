package Method;

import java.util.Scanner;

public class Method2 {

    static void luasPersegi(int x) {
        double luas = x * x * x;
        System.out.println("Luas persegi= " + luas);
    }
    static void luasSegitiga(int x,int y){
        double luas =  x*y/2;
        System.out.println("Luas segitiga= " + luas);
    }
    static void luasLingkaran(int x){
        double luas = 3.14 * x;
        System.out.println("Luas lingkaran= " + luas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luas, sisi, tinggi, jari,pilih;
        System.out.print("Sisi (s)= ");
        sisi = input.nextInt();
        System.out.print("Tinggi (t)= ");
        tinggi = input.nextInt();
        System.out.print("Jari-jari (r)= ");
        jari = input.nextInt();
        System.out.println("");
        
        do{
            System.out.println("Pilih 1-4: ");
        System.out.println("1. Menghitung luas persegi");
        System.out.println("2. Menghitung luas segitiga");
        System.out.println("3. Menghitung luas lingkaran");
        System.out.println("4. Selesai");
        System.out.print(": ");
        pilih = input.nextInt();
        switch(pilih) {
            case 1:
                luasPersegi(sisi);
                break;
            case 2:
                luasSegitiga(sisi, tinggi);
                break;
            case 3:
                luasLingkaran(jari);
                break;
        }
        
        } while (pilih !=4 );

    }
}
