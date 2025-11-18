package test;

public class LatihanMetode2II {
    public static void main(String[] args) {
        String makan    = "Nasi Goreng";
        String minuman  = "Es teh";
        System.out.println(makan(makan)+"\n");
        System.out.println(makan(makan, minuman));
    }
    public static String makan(String makan) {
        return "saya sedang makan"+makan;
    }
    public static String makan(String makan, String minuman) {
        return "Saya sedang makan "+makan+" dan minum"+minuman;
    }
}
