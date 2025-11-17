package Method;
import java.util.Scanner;
public class pemdasNethodMTK {
    static int sisi =0;
    
    static void luasPersegi(){
        System.out.println("Sisi Persegi: " + sisi);
        System.out.println("Luas Persegi: " + (sisi*sisi));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Sisi Persegi: ");
        sisi = input.nextInt();
        luasPersegi();
    }
}
