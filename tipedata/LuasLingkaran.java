/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author LENOVO
 */
public class LuasLingkaran {

    public static void main(String[] args) {
        double r = 11.78;
        double PI = 3.141592;
        double Luaslingkaran = PI * r * r;
        int Luaslingkaranbulat = (int) (PI * r * r);
        double luasLingkaranRound = Math.round(Luaslingkaran);
        System.out.println("Luas Lingkaran");
        System.out.println("dalam pecahan        :" + Luaslingkaran);
        System.out.println("dalam bilangan bulat :" + Luaslingkaranbulat);
        System.out.println("dalam pembulatan     :" + luasLingkaranRound);

    }

}
