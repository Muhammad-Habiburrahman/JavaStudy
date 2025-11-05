package perulangan;
import java.util.Scanner;

public class MenghitungKalimat {
public static void main (String[] args){
   Scanner scanner = new Scanner (System.in);
   
    System.out.print("Masukkan sebuah kalimat: ");
    String sentencen = scanner.nextLine();
    
    int wordCount = 1;
    for (int i = 0; i < sentencen.length(); i++) {
        if (sentencen.charAt(i)== ' ') {
            wordCount++;
        }
    }
    System.out.println("Jumlah kata: "+wordCount);
}

    


}
