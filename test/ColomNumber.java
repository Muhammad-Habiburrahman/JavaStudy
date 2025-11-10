package test;

import java.util.Scanner;

public class ColomNumber {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int rows, columns,angka = 1;
        
        
        System.out.print("Enter the number of rows: ");
        rows = Scanner.nextInt();
        System.out.print("Enter the number of coloumns: ");
        columns = Scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            System.out.println(" ");
            for (int j = 1; j <= columns; j++) {
                System.out.print(angka+" ");
                angka++;
            }
        }
        System.out.println("");

    }

}
