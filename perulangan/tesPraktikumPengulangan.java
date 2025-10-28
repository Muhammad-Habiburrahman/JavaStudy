
package perulangan;

public class tesPraktikumPengulangan {
    public static void main (String[] args){
        for (int i = 1; i <= 20; i++) {
            for (int i2 = 1; i2 <= 20; i2++) {
                System.out.print("0");
                if (i2 == 10){
                    break;
                }
            }
            System.out.println("\n");
            if (i == 10){
                break;
            }
        }
    }
}
