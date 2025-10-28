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
public class praktikum3 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("a = ");
        int a = input.nextInt(); 
        System.out.print("b = ");
        int b = input.nextInt();
        
        System.out.println("--------------------------");
        System.out.println("penjumlahan  = " + (a+b));
         System.out.println("pengurangan  = " + (a-b));
          System.out.println("pengalian  = " + (a*b));
          System.out.println("pembagian  = " + (a/b));
          System.out.println("modulus  = " + (a%b));
          
        
        
    }
}
