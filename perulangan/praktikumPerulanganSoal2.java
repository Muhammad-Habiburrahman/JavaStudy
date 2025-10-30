package perulangan;

import java.util.Scanner;

public class praktikumPerulanganSoal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, angka2, hasil = 0, prima;
        angka = input.nextInt();
        angka2 = input.nextInt();

        for (int i = angka; i <= angka2; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                prima = 0;
            } else {
                prima = 1;
            }
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                prima = 1;
            }
            if (i == 1) {
                prima = 0;
            }hasil = hasil + prima; 
        }
        System.out.println(hasil);
    }
}
