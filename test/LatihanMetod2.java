package test;

public class LatihanMetod2 {

    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Sisi persegi= " + sisi + "cm");
        int luas = luasPersegi(sisi);
        System.out.println("Luas Pesegi= "+luas+" cm^2 ");
        }
    public static int luasPersegi(int sisi){
        
        return sisi*sisi;
    }
}  
