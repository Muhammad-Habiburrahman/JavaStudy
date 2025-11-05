package perulangan;

import java.util.Scanner;

public class StringReversed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (angka % i == 0) {
                System.out.println(angka + " ini merupakan kelipatan " + i);
            }
        }
    }

}
