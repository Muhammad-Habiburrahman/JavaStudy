package perulangan;

import java.util.Scanner;

public class RataWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        double bilangan, nilai = 0, rata;
        System.out.print("Masukkan Jumlah Bilangan : ");
        bilangan = input.nextInt();
        while (i <= bilangan) {
            System.out.print("Masukkan Data Ke-" + i + " : ");
            nilai = nilai + input.nextInt();
            i++;
        }
        rata = nilai / bilangan;
        System.out.println("Nilai Rata-rata = " + rata);
    }
}
