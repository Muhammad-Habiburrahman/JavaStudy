/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author LENOVO
 */
public class MOdultest {
    public static void main (String[] args){
        int hari = 7;
        String tipeHari = null;
        switch (hari){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipeHari = "Hari kerja";
                break;
            case 6:
            case 7:
                tipeHari = "Weekend";
        }
        System.out.println("Hari yang dipilih adalah " + tipeHari);
    } 
}
