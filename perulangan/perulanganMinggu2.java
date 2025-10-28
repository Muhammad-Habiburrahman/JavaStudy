package perulangan;

import java.util.Scanner;

public class perulanganMinggu2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = 0;
        System.out.print("Masukkan jumlah Bilangan: ");
        bilangan = input.nextInt();
        double rata;
        double nilai = 0;

        for (int i = 1; i <= bilangan; i++) {
            System.out.print("Masukkan data ke - " + i + ":");
            nilai += input.nextDouble();
        }
        rata = nilai / bilangan;
        System.out.println("Nilai Rata-rata =" + rata);
    }
}
