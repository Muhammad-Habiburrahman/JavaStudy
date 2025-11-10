package test;


public class NestedLoop2 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(j+" ");
            }
            System.out.println("");
        }
    }
    
}
