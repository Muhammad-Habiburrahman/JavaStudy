package perulangan;
import java.util.Scanner;

public class MenghitungHurufVokal {
public static void main (String[] args){
    Scanner Scanner = new Scanner (System.in);
    
    System.out.print("Masukkan sebuah kalimat: ");
    String sentence = Scanner.nextLine();
    sentence = sentence.toUpperCase();
    
    int vowelCount = 0; 
    for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);
        if (ch == 'A'||ch == 'U'||ch == 'I'||ch == 'E'||ch == 'O') {
            vowelCount++;
        }
    }
    System.out.println("Jumlah huruf Vokal: "+vowelCount);
    
    Scanner scanner = new Scanner (System.in);
    System.out.print("Masukkan sebuah kata atau kalimat: ");
    sentence =scanner.nextLine();
    
    String result = " ";
    for (int i = 0; i < sentence.length(); i++) {
        char ch =sentence.charAt(i);
        if (ch== 'a' || ch== 'A') {
            result += '@';
        }else{
            result += ch;
        }
    }
    System.out.println("Kalimat setelah pengganti: "+result);
}    
}
