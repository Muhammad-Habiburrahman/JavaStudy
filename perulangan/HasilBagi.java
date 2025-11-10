package perulangan;
import java.util.Scanner;

public class HasilBagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,hasilbagi,sisa;
        int i = 1;
        
        System.out.print("Masukkan Angka:");
        angka = input.nextInt();
        
        while(i <= 10){
            hasilbagi = angka / i;
            sisa = angka % i;
            System.out.println(angka+":"+i+" = "+hasilbagi+" sisa "+sisa);
            i++;
        }
    }
}
