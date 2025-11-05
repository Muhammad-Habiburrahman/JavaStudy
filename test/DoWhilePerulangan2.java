package test;


public class DoWhilePerulangan2 {
 public static void main (String []args){
     int outer = 1;
  while (outer < 4){
      int inner = 5;
      while (inner < 12) {
          System.out.println(outer+" "+inner);
          inner++;
      }
      outer++;
    }
  }   
}
