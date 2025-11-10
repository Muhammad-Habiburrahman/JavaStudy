package test;
import java.util.Scanner;

public class BelahKetuypat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your numbers: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            // cetak spasi di depan
            for (int s = i; s < number; s++) {
                System.out.print(" ");
            }

            // angka menaik dari 1 ke i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // angka menurun dari i-1 ke 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
