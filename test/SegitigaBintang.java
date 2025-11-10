package test;
import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int number = 0;
        System.out.print("Input your numbers: ");
        number = input.nextInt();
        
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i||i==number) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
