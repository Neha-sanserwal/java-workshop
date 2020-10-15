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

  @Override
  public String toString() {
    return String.format("Point@ { x: " + this.x + ", y: " + this.y + " }");
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Point)) {
      return false;
    }
    if (other == this) {
      return true;
    }
    Point otherPoint = (Point) other;
    if (this.x == otherPoint.x && this.y == otherPoint.y) {
      return true;
    }
    return false;
  }
}

public class Geometry {

  public static void main(String[] args) {
    Point zeroPoint = new Point();
    Point nonZeroPoint = new Point(2, 4);
    Point otherZeroPoint = new Point();
    System.out.println("Point at zero :" + zeroPoint.toString());
    System.out.println("Non-zero point :" + nonZeroPoint);
    System.out.println(
      "zeroPoint and otherZeroPoint are equal? :" +
      zeroPoint.equals(otherZeroPoint)
    );
    System.out.println(
      "zeroPoint and nonZeroPoint are equal? :" + zeroPoint.equals(nonZeroPoint)
    );

    System.out.println(
      "nonZeroPoint and null are equal? :" + nonZeroPoint.equals(null)
    );
  }
}
