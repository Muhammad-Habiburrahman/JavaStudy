package Method;

public class materi_Pemdas_Parameter4 {

    private static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int result = getSquare(i);
            System.out.println("Square of " + i + " is: " + result);
        }
    }
}
