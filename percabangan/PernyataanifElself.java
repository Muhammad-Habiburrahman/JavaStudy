/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author LENOVO
 */
public class PernyataanifElself {

    public static void main(String[] args) {
        double skorUjian = 50;
        String nilai;

        if (skorUjian >= 90) {
            nilai = "A";
        } else if (skorUjian >= 80) {
            nilai = "B";
        } else if (skorUjian >= 70) {
            nilai = "C";
        } else {
            nilai = "D";
        }
        System.out.println("Nilai =" + nilai);
    }
}
