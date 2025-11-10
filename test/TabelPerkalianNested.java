package test;


public class TabelPerkalianNested {
    public static void main(String[] args) {
        int perkalian = 10; 
        int hasilKali = 1;
        
        for (int i = 1; i <= perkalian;i++) {
            System.out.println("Perkalian "+i+": ");
            for (int j = 1; j <= 10; j++) {
                hasilKali = i*j;
                System.out.println(i+"*"+j+" = "+ hasilKali);
            }
            System.out.println(" ");
        }
    }
    
}
