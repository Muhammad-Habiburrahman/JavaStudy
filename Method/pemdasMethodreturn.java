
package Method;
import java.util.Scanner;

public class pemdasMethodreturn {
static int sisi = 0;

static int luasPersegi(){
    int hasil = sisi*sisi;
    return hasil;
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan sisi pesegi: ");
        sisi=input.nextInt();
        int luas = luasPersegi();
        
        System.out.println("Sisi persegi: "+sisi);
        System.out.println("Luas persegi: "+luas);
    }
}
