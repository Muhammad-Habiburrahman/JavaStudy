package test;


public class Corettan {
   public static int ini(int n){
       int total=0;
       for (int i = 1; i <= n; i++) {
           total= i*2;
       }
       return total;
   }
    public static int itu(int n) {
        int total=0;
        for (int j = 1; j <= n; j++) {
            total+= ini(j);
        }
        return total;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(itu(n)+ini(n-1));
    }
}
