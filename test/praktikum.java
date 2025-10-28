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
public class praktikum {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Nama : "); 
        String nama = input.nextLine();
        System.out.print("NIM : "); 
        String nim = input.nextLine();
        System.out.print("Nilai : "); 
        String nilai = input.nextLine();
        
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim); 
        System.out.println("Nilai : "+nilai);
    }
}
