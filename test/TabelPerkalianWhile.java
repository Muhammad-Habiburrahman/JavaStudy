
package test;


public class TabelPerkalianWhile {
    public static void main(String[] args) {
        int i = 1;
        int hasilKali;
        System.out.println("Tabel Perkalian");
        while (i <= 2) {
            int j = 1;
            while (j <= 5) {
                hasilKali = i*j;
                System.out.println(i+"*"+j+"="+ hasilKali);
                j++;
            }
             i++;
        }
    }
  
}
