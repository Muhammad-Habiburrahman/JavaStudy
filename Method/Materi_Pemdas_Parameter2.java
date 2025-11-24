package Method;

public class Materi_Pemdas_Parameter2 {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Sebelum Swapping, a =" + a + " and b =" + b);
        swapFunction(a, b);
        System.out.println("Setelahe Swapping, a =" + a + " adn b is =" + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Sebelum Swapping, a =" + a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Setelah Swapping, a =" + a + " b= " + b);
    }
}
