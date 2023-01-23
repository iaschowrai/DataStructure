package Arrays;

import java.util.Arrays;

public class transposeMatrix {

    public static void main(String[] args) {
        int TPA[][] = {{1, 5, 7, 9, 10},
                                    {66, 10, 12, 13, 20},
                                    {9, 25, 29, 30, 32},
                                    {15, 55, 59, 63, 68},
                                    {40, 70, 79, 81, 95}};
        tpmatrix(TPA);
    }
    public static void tpmatrix(int mat[][]){
        int TPB[][] = new int[mat.length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                TPB[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < TPB.length; i++) {
            for (int j = 0; j <TPB[i].length; j++) {
                System.out.print(TPB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
