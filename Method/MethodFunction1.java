package Method;

import java.util.Scanner;

public class MethodFunction1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih, masukkanA = 0, masukkanB = 0, masukkanN = 0,prima,hasil = 0;
        boolean angka_prima = true;
        do {
            System.out.println("=== SELAMAT DATANG DI PROGRAM ARITMATIKA ===");
            System.out.println("1. Input nilai a, b, dan n");
            System.out.println("2. Menghitung suku ke-n");
            System.out.println("3. Menghitung jumlah total n suku pertama");
            System.out.println("4. Menghitung jumlah bilangan prima");
            System.out.println("5. Keluar");
            System.out.print("Pilihan anda: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai suku pertama(a)  : ");
                    masukkanA = in.nextInt();
                    System.out.print("Masukkan selisih antara suku (b): ");
                    masukkanB = in.nextInt();
                    System.out.print("Masukkan bannyak suku (n)       : ");
                    masukkanN = in.nextInt();
                    System.out.println("Nilai a, b, dan n berhasil diinput\n");
                    break;
                case 2:
                    System.out.println("Hasil dari suku ke-" + masukkanN + " adalah " + sukuKeN(masukkanA, masukkanB, masukkanN) + prima(sukuKeN(masukkanA, masukkanB, masukkanN), angka_prima));
                    break;
                case 3:
                    System.out.println("Total suku ke-" + masukkanA + " hingga ke-" + masukkanN + " adalah " + totalN(masukkanA, masukkanB, masukkanN));
                    break;
                case 4:
                    for (int i = masukkanA; i <= sukuKeN(masukkanA, masukkanB, masukkanN); i+=masukkanB) {
                        if (i%2==0||i%3==0||i%5==0||i%7==0) {
                            prima = 0;
                        }else  {
                            prima = 1;
                        }
                        if (i==2||i==3||i==5||i==7) {
                            prima = 1;
                        }
                        if (i==1) {
                            prima=0;
                        } hasil +=prima;
                    }
                    System.out.println("Bilangan prima dari suku "+masukkanA+" hingga "+masukkanN+" berjumlah "+hasil);
                    break;

            }
        } while (pilih!=5);

    }

    static double sukuKeN(double a, double b, double n) {
        double hasil = a + (n - 1) * b;
        return hasil;
    }

    static String prima(double sukuKeN, boolean angka_prima) {
        if (sukuKeN == 0 || sukuKeN == 1) {
            angka_prima = true;
        } else {
            for (int i = 2; i <= sukuKeN / 2; i++) {
                if (sukuKeN % i == 0) {
                    angka_prima = false;
                    break;
                }
            }
        }
        if (angka_prima) {
            return "Dan " + sukuKeN + " merupakan bilangan prima";
        } else {
            return "Dan " + sukuKeN + " bukan bilangan prima";
        }
    }

    static double totalN(double a, double b, double n) {
        double hasil = (1.0 / 2.0) * n * (2 * a + (n - 1) * b);
        return hasil;
    }
}
