public class Main {

  public static void printMatrix(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int cell = 0; cell < matrix.length; cell++) {
        System.out.print(matrix[row][cell]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }

  public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] + matrixB[row][cell];
      }
    }
    return matrixC;
  }

  public static int[][] subtractMatrix(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] - matrixB[row][cell];
      }
    }
    return matrixC;
  }

  public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] * matrixB[cell][row];
      }
    }
    return matrixC;
  }

  public static int determinant(int[][] matrix, int startRow, int startCol) {
    if (matrix.length == 1) {
      return matrix[startRow][startCol];
    }
    return 0;
  }

  public static void main(String[] args) {
    int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    //  printMatrix(matrix1);
    //  System.out.println("---------------------------------");
    //  printMatrix(matrix2);
    //  System.out.println("---------------------------------");
    //  int[][] resultantMatrix = addMatrix(matrix1, matrix2);
    //  printMatrix(resultantMatrix);
    //  System.out.println("---------------------------------");

    //  resultantMatrix = multiplyMatrix(matrix1, matrix2);
    //  printMatrix(resultantMatrix);
    //  System.out.println("---------------------------------");

    //  resultantMatrix = subtractMatrix(matrix1, matrix2);
    //  printMatrix(resultantMatrix);
    //  System.out.println("---------------------------------");
    int[][] matrixA = { { 1 } };
    System.out.println(determinant(matrix1, 0, 0));
    System.out.println("---------------------------------");
  }
}
