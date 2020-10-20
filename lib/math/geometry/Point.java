package math.geometry;

public class Point {
  private double x;
  private double y;

  public Point() {
    this.x = 0.0;
    this.y = 0.0;
  }

  public String toString() {
    return String.format("Point@(%.2f, %.2f)", x, y);
  }
}
