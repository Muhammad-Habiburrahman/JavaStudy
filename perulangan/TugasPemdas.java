package perulangan;

public class TugasPemdas {

    public static void main(String[] args) {
        int rows = 10;

        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int s = i; s < rows; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", pascal[i][j]);
            }

            System.out.println();
        }
    }
}
