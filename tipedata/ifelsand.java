/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author LENOVO
 */
public class ifelsand {
    public static void main(String[] args){
        double skorUjian = 100;
        String nilai;
        if (skorUjian >= 0 && skorUjian <= 100)
        {
            if (skorUjian >= 90){
                nilai = "A";
            }
            else if (skorUjian >= 80){
                nilai = "B";
            }
            else if (skorUjian >= 70){
                nilai = "C";
            }
            else {
                nilai = "D";
            }
            System.out.println("Nilai : " + nilai);
        }
        else{
            System.out.println("Nilai yang anda masukkan salah");
        }
    }
}
