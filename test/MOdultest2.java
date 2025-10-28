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
public class MOdultest2 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        String pilih;
        System.out.println("--malamminggunya programmer--\n");
        System.out.println("kmau pilih aku atau dia ??? ");
        pilih = in.nextLine();
        switch (pilih){
            case "kamu":
                System.out.println("\nAku pasti akna lebih baik dari pada dia ! ");
                break;
            case "dia":
                System.out.println("Lebih baik aku pergi jauh dari mu ");
                break;
            default:
                System.out.println("Jawabanya gada anjayy");
        }
    }
}
