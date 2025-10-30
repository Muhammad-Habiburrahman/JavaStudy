
package perulangan;
import java.util.Scanner;
public class praktikumPerulanganSoal1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int total = 0;
        System.out.print("Tabel perkalian : ");
        int nilai = input.nextInt();
        
        if (nilai <= 0) {
            System.out.println("Eror!!");
        }else {
            for (int i = 1; i <= 10; i++) {
                int hasil = nilai*i;
                total = total+hasil;
                System.out.println(nilai+"X"+i+"="+hasil);
            }
            System.out.println("Total hasil seluruh perkalian adalah : "+total);
        }
    }
}
