/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Matematika {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int angka1,angka2,menu, pilihan = 0,hasil;
        String penambahan, pengurangan, perkalian, pembagian, operasi; 
        System.out.println("Menu aplikasi matematika: ");
        System.out.println("1.penambahan \t 2. pengurangan \t 3.perkalian \t 4.pemabgian");
        
        System.out.print("pilih menu: ");
        pilihan = input.nextInt();
        
        if (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4){
            System.out.print("Masukkan angka pertama= ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua= ");
            angka2 = input.nextInt();
            
            if(pilihan == 1){
                hasil=angka1+angka2;
                operasi = "penambhana";
            }
            else if (pilihan == 2){
                hasil=angka1-angka2;
                operasi = "Pengurangan";
            }
            else if (pilihan == 3){
                hasil=angka1*angka2;
                operasi = "perkalian";
            }
            else if (pilihan == 4){
                hasil=angka1/angka2;
                operasi = "pembagian";
            }
            else{
                System.out.println("EROR");
            }
        }
    }
}
