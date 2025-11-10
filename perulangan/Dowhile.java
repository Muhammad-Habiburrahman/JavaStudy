package perulangan;
import java.util.Scanner;

public class Dowhile {
   public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int angka,hasilbagi,sisa;
        int i = 1;
        
        System.out.print("masukkan angka: ");
        angka = masuk.nextInt();
        
        do{
             hasilbagi = angka / i;
            sisa = angka % i;
            System.out.println(angka+":"+i+" = "+hasilbagi+" sisa "+sisa);
            i++;
        }
        while(i <= 10);
    }
}  

