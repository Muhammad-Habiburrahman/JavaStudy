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
public class praktikumPercabganganI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int nilai, masukkanAngka;
        
        System.out.print("Masukkan angka: ");
        masukkanAngka = keyboard.nextInt (); 
        if (masukkanAngka % 2 == 0){
            System.out.println( masukkanAngka + " Ini merupakan Kelipatan 2");
        }
        if (masukkanAngka % 3 == 0){
            System.out.println( masukkanAngka + " Ini merupakan Kelipatan 3");
        }
        if (masukkanAngka % 6 == 0){
            System.out.println(masukkanAngka + " Ini Merupakan kelipatan 6");
        }
        if (masukkanAngka % 9 == 0){
            System.out.println( masukkanAngka + " Ini merupakan kelipatan 9");
        }
    }
}
