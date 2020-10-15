class Point {
  private float x;
  private float y;

  public Point() {
    this.x = 0.0F;
    this.y = 0.0F;
  }

  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }
}

public class Geometry {

  public static void main(String[] args) {
    Point pointAtZero = new Point();
    Point nonZeroPoint = new Point(2, 4);
    System.out.println("Point at zero :" + pointAtZero);
    System.out.println("Non-zero point :" + nonZeroPoint);
  }
}
