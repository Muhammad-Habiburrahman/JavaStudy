/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class UcapanVarIO {
    public static void main(String [] args){
        Scanner masukan = new Scanner (System.in);
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat1 = masukan.nextLine(); 
        System.out.print("Masukkan kalimat lainnya: ");
        String kalimat2 = masukan.nextLine();

        System.out.println("--------------------");
        System.out.println("Kalimat yang anda masukan adalah: ");
        System.out.println(kalimat1 + " dan " + kalimat2);
    }
}
