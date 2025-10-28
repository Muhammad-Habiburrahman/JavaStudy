package perulangan;

import java.util.Scanner;

public class perulanganMinggu2Materi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;

        System.out.print("Jumlah anak ayam: ");
        jumlah = input.nextInt();
        System.out.println("");

        System.out.println("Tek Kotek Kotek Kotek Anak Ayam Turun Berkotek");

        for (int i = jumlah; i > 1; i--) {
            jumlah--;
            System.out.println("Anak ayam Turunlah " + i + " Mati satu tinggallah " + jumlah);

            if (jumlah == 1) {
                System.out.println("Anak ayam Turunlah 1 Mati Satu Tinggal Induknya");
            }
        }
    }
}
