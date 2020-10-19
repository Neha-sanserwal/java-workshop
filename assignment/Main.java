class Matrix {

  public static void print(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int cell = 0; cell < matrix.length; cell++) {
        System.out.print(matrix[row][cell]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }

  public static int[][] add(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] + matrixB[row][cell];
      }
    }
    return matrixC;
  }

  public static int[][] subtract(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] - matrixB[row][cell];
      }
    }
    return matrixC;
  }

  public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
    int length = matrixA.length;
    int[][] matrixC = new int[length][length];
    for (int row = 0; row < length; row++) {
      for (int cell = 0; cell < length; cell++) {
        matrixC[row][cell] = matrixA[row][cell] * matrixB[cell][row];
      }
    }
    return matrixC;
  }
}

public class Main {

  public static void main(String[] args) {
    int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    Matrix.print(matrix1);
    System.out.println("---------------------------------");
    Matrix.print(matrix2);
    System.out.println("---------------------------------");
    int[][] resultantMatrix = Matrix.add(matrix1, matrix2);
    Matrix.print(resultantMatrix);
    System.out.println("---------------------------------");

    resultantMatrix = Matrix.multiply(matrix1, matrix2);
    Matrix.print(resultantMatrix);
    System.out.println("---------------------------------");

    resultantMatrix = Matrix.subtract(matrix1, matrix2);
    Matrix.print(resultantMatrix);
    System.out.println("---------------------------------");
    // System.out.println(Matrix.determinant(matrix1, 0, 0));
  }
}
