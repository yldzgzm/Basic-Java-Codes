public class Main {
    public static void main(String[] args) {
        String[][] B = new String[7][4];

        printB(B);

        for (String[] row : B) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printB(String[][] B) {
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (i % 3 == 0) {
                    B[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    B[i][j] = " * ";
                } else
                    B[i][j] = "    ";
            }
        }
    }
}
