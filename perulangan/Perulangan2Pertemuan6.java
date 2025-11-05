
package perulangan;
import java.util.Scanner;

public class Perulangan2Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i = 0, nilai = 0, total = 0, jumlah= 0, dataValid=0;
        double rata=0;
        
        while ( nilai != -1){
            System.out.print("Masukkan jumlah nilai mahasiswa (ketik -1 untuk berhenti): ");
        nilai = input.nextInt();
            if (nilai >100 || nilai <= -1) {
                System.out.println("[nilai tidak valid]");
            }else{
                dataValid++;
                total += nilai;
            }
        }
        rata = total/dataValid;
        System.out.println(" ");
        System.out.println("Jumlah data valid: "+dataValid);
        System.out.println("Total nilai: "+total);
        System.out.println("Rata-Rata: "+rata);
    }
}
