package perulangan;

import java.util.Scanner;

public class perulanganMinggu2Materi3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, hasilBagi, sisaBagi;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            hasilBagi = angka / i;
            sisaBagi = angka % i;
            System.out.println(angka + ":" + i + " = " + hasilBagi + " sisa " + sisaBagi);

        }
    }
}
