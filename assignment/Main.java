class Matrix {
  private int noOfRows;
  private int noOfColumns;
  private int[][] values;

  public Matrix(int noOfRows, int noOfColumns) {
    this.noOfColumns = noOfColumns;
    this.noOfRows = noOfRows;
    this.values = new int[noOfRows][noOfColumns];
  }

  public static Matrix create(int[][] values) {
    int noOfRows = values.length;
    int noOfColumns = values[0].length;
    Matrix matrix = new Matrix(noOfRows, noOfColumns);
    for (int rowNo = 0; rowNo < values.length; rowNo++) {
      System.arraycopy(values[rowNo], 0, matrix.values[rowNo], 0, noOfColumns);
    }
    return matrix;
  }

  public static void print(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int cell = 0; cell < matrix.length; cell++) {
        System.out.print(matrix[row][cell]);
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int[] row : this.values) {
      for (int value : row) {
        stringBuilder.append(value).append(" ");
      }
      stringBuilder.append("\n");
    }
    return stringBuilder.toString();
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

    Matrix matrix = Matrix.create(matrix1);
    // Matrix.print(matrix1);
    // System.out.println("---------------------------------");
    // Matrix.print(matrix2);
    // System.out.println("---------------------------------");
    // int[][] resultantMatrix = Matrix.add(matrix1, matrix2);
    // Matrix.print(resultantMatrix);
    // System.out.println("---------------------------------");

    // resultantMatrix = Matrix.multiply(matrix1, matrix2);
    // Matrix.print(resultantMatrix);
    // System.out.println("---------------------------------");

    // resultantMatrix = Matrix.subtract(matrix1, matrix2);
    // Matrix.print(resultantMatrix);
    // System.out.println("---------------------------------");
    // // System.out.println(Matrix.determinant(matrix1, 0, 0));
  }
}
