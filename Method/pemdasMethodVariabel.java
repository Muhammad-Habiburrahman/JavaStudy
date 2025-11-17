package Method;


public class pemdasMethodVariabel {
static String nama = "Program ku";
static String versi = "1.0.0";

static void help(){
    String nama = "Ilmu Komputer";
    
    System.out.println("Nama    : " + nama);
    System.out.println("Versi   : " + versi);
}
    public static void main(String[] args) {
        help();
        System.out.println("Nama    :"+nama);
        System.out.println("Versi   :"+versi);
    }
}
