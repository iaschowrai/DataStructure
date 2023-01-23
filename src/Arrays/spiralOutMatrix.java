package Arrays;

public class spiralOutMatrix {
    public static void main(String[] args) {
        int spiralMatrix[][] = {{1,5,7,9,10,11},
                                {66,10,12,13,20,21},
                                {9,25,29,30,32,41},
                                {15,55,59,63,68,70},
                                {40,70,79,81,95,105}};
        spmatrix(spiralMatrix);

    }
    public static void spmatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
