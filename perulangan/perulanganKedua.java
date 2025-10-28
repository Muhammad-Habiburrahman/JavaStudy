
package perulangan;

public class perulanganKedua {
    public static void main (String[] args){
        for (int i = 10; i >= 1; i--) {
            System.out.println("nilai ke-" + i);
        }
        System.out.println("");
        
        for (int i = 1; i <=20; i+=2) {
            System.out.println("nilai ke-"+i);
        }
        System.out.println("");
        
        int nilai = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("nilai ke -" + nilai);
            nilai = nilai + 2;
        }
    }
}
