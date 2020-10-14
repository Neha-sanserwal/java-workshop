class Bitwise {

  public static int invert(int value) {
    return ~value;
  }
}

public class Operators {

  public static void main(String[] args) {
    System.out.println("Invert of 1 : " + Bitwise.invert(1));
    System.out.println("Invert of 2 : " + Bitwise.invert(2));
    System.out.println("Invert of 5 : " + Bitwise.invert(5));
    System.out.println("Invert of 4 : " + Bitwise.invert(4));
  }
}
