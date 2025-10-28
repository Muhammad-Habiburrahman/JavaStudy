/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class MOdultest3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nilai anda (1-4) ");
        int nilai = input.nextInt();
        switch (nilai){
            case 1:
                System.out.println("Anda mendapatkan D ");
                break;
            case 2:
                System.out.println("Anda mendapatkan C ");
                break;
            case 3:
                System.out.println("Anda mendapatkan B" );
                break;
            case 4:
                System.out.println("Ada mendapatkan A ");
                break;
            default:
                System.out.println("404 NOT FOUND ");
        }
    }
}
