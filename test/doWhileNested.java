
package test;


public class doWhileNested {
    public static void main(String[] args) {
        int i = 1;
        do {
            int k = 3;
            do{
                System.out.println(" ");
                k--;
            } while (k >= 1);
            int j = 1;
            do {
                System.out.println(i+ " ");
                j++;
            } while (j <= i);
            System.out.println(" ");
            i++;
        } while (i <= 5);
    }
}
