package Method;
import java.util.Scanner;

public class MethodFuction2 {
   static long faktorial(long n) {
        long hasil = 1;
        for (long i = 1; i <= n; i++) hasil *= i;
        return hasil;
    }
     static long permutasi(long n, long r) {
        return faktorial(n) / faktorial(n - r);
    }
     static long kombinasi(long n, long r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }
     static void tampilPermutasi(long n, long r) {
        long hasil = permutasi(n, r);
        System.out.println(" HASIL PERMUTASI ");
        System.out.println("P(" + n + ", " + r + ") adalah = " + hasil);
    }   
    static void tampilKombinasi(long n, long r) {
        long hasil = kombinasi(n, r);
        System.out.println(" HASIL KOMBINASI ");
        System.out.println("C(" + n + ", " + r + ") adalah = " + hasil);
    }  
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        long n, r;

        do {
            System.out.println("> PROGRAM KALKULATOR PELUANG <");
            System.out.println("1. Hitung Permutasi");
            System.out.println("2. Hitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();

            if (menu == 1 || menu == 2) {

                System.out.print("Masukkan nilai n : ");
                n = input.nextLong();
                System.out.print("Masukkan nilai r : ");
                r = input.nextLong();

                
                if (n < 0 || r < 0) {
                    System.out.println("Input tidak boleh negatif!");
                    continue;
                }
                if (n <= r) {
                    System.out.println("Nilai n harus lebih besar dari r!");
                    continue;
                }
                if (n > 20 || r > 20) {
                    System.out.println("Nilai maksimal adalah 20!");
                    continue;
                }

                if (menu == 1) tampilPermutasi(n, r);
                else tampilKombinasi(n, r);

            } else if (menu != 3) {
                System.out.println("Menu tidak valid!");
            }

        } while (menu != 3);

        System.out.println("Program selesai");
    }

}
