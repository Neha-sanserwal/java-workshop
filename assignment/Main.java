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

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Matrix:\n");
    for (int[] row : this.values) {
      for (int value : row) {
        stringBuilder.append(value).append(" ");
      }
      stringBuilder.append("\n");
    }
    return stringBuilder.toString();
  }

  public Matrix add(Matrix other) {
    if (
      this.noOfRows != other.noOfRows && this.noOfColumns != other.noOfColumns
    ) {
      return null;
    }
    Matrix result = new Matrix(this.noOfRows, this.noOfColumns);
    for (int rowNo = 0; rowNo < this.noOfRows; rowNo++) {
      for (int colNo = 0; colNo < this.noOfColumns; colNo++) {
        int sum = this.values[rowNo][colNo] + other.values[rowNo][colNo];
        result.values[rowNo][colNo] = sum;
      }
    }
    return result;
  }

  public Matrix subtract(Matrix other) {
    if (
      this.noOfRows != other.noOfRows && this.noOfColumns != other.noOfColumns
    ) {
      return null;
    }
    Matrix result = new Matrix(this.noOfRows, this.noOfColumns);
    for (int rowNo = 0; rowNo < this.noOfRows; rowNo++) {
      for (int colNo = 0; colNo < this.noOfColumns; colNo++) {
        int difference = this.values[rowNo][colNo] - other.values[rowNo][colNo];
        result.values[rowNo][colNo] = difference;
      }
    }
    return result;
  }

  public Matrix multiply(Matrix other) {
    Matrix result = new Matrix(this.noOfRows, this.noOfColumns);
    for (int rowNo = 0; rowNo < this.noOfRows; rowNo++) {
      for (int colNo = 0; colNo < this.noOfColumns; colNo++) {
        int product = this.values[rowNo][colNo] * other.values[colNo][rowNo];
        result.values[rowNo][colNo] = product;
      }
    }
    return result;
  }

  public int getDeterminant() {
    if (this.noOfRows == 1 && noOfColumns == 1) {
      return this.values[0][0];
    }
    if (this.noOfRows == 2 && noOfColumns == 2) {
      int product1 = this.values[0][0] * this.values[1][1];
      int product2 = this.values[0][1] * this.values[1][0];
      return product1 - product2;
    }
    return 0;
  }
}

public class Main {

  public static Matrix addMatrix() {
    int[][] valuesA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] valuesB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    Matrix matrixB = Matrix.create(valuesA);
    Matrix matrixA = Matrix.create(valuesB);
    return matrixA.add(matrixB);
  }

  public static Matrix subtractMatrix() {
    int[][] valuesA = { { 7, 8, 9 }, { 4, 5, 6 }, { 1, 2, 3 } };
    int[][] valuesB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    Matrix matrixB = Matrix.create(valuesA);
    Matrix matrixA = Matrix.create(valuesB);
    return matrixA.subtract(matrixB);
  }

  public static Matrix multiplyMatrix() {
    // int[][] valuesA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    // int[][] valuesB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // Matrix matrixB = Matrix.create(valuesA);
    // Matrix matrixA = Matrix.create(valuesB);
    // return matrixA.multiply(matrixB);

    int[][] valuesC = { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] valuesD = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
    Matrix matrixC = Matrix.create(valuesC);
    Matrix matrixD = Matrix.create(valuesD);
    return matrixC.multiply(matrixD);
  }

  public static void calculateDeterminant() {
    int[][] valuesA = { { 5 } };
    Matrix matrixA = Matrix.create(valuesA);
    System.out.println(
      "Determinant for 1 * 1 matrix with one element : " +
      matrixA.getDeterminant()
    );

    int[][] valuesB = { { 1, 2 }, { 3, 4 } };

    Matrix matrixB = Matrix.create(valuesB);
    System.out.println(
      "Determinant for 2 * 2 matrix : " + matrixB.getDeterminant()
    );
  }

  public static void main(String[] args) {
    // System.out.println(addMatrix());
    // System.out.println(subtractMatrix());
    // System.out.println(multiplyMatrix());
    calculateDeterminant();
  }
}
