package perulangan;
import java.util.Scanner;

public class belajarPerulangan {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int total = 0;
        System.out.print("Tabel perkalian: ");
        int nilai = input.nextInt();
        
        if (nilai <= 0) {
            System.err.println("Eror");
        } else {
            for (int i = 1; i <= 10; i++) {
                int hasil = nilai*i;
                total = total + hasil;
                System.out.println(nilai + "x"+i+"="+hasil);
            }
            System.out.println("Total seluruh hasil perkalian adalah : "+total);
        }
        
    }
}
