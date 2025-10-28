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
public class praktikumPercabanganII {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b;
        String apa;
        
        System.out.println("--Kalkulator otomatis--");
        System.out.println("");
        System.out.print("Mau diapa kan: ");
        apa = input.nextLine();
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.println("");
        if (apa.equalsIgnoreCase("Pertambahan")){
            System.out.println(a + b);
        }
        else if (apa.equalsIgnoreCase("Pengurangan")){
            System.out.println(a-b);
        }
        else if (apa.equalsIgnoreCase("Perkalian")){
            System.out.println(a*b);
        }
        else if (apa.equalsIgnoreCase("Pembagian")){
            System.out.println(a/b);
        }
        else{
            System.out.println("EROR!!!");
        }
    }
}
