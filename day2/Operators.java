class Bitwise {

  public static int invert(int value) {
    return ~value;
  }

  public static int leftShift(int value, int by) {
    return value << by;
  }

  public static int rightShift(int value, int by) {
    return value >> by;
  }

  public static int xor(int num1, int num2) {
    return num1 ^ num2;
  }

  public static int ior(int num1, int num2) {
    return num1 | num2;
  }
}

public class Operators {

  public static void main(String[] args) {
    System.out.println("Invert of 1 : " + Bitwise.invert(1));
    System.out.println("Invert of 2 : " + Bitwise.invert(2));
    System.out.println("Invert of 5 : " + Bitwise.invert(5));
    System.out.println("Invert of 4 : " + Bitwise.invert(4));
    System.out.println("--------------------------------------------------");

    System.out.println("leftShift of 1 by 1: " + Bitwise.leftShift(1, 1));
    System.out.println("leftShift of 2 by 1: " + Bitwise.leftShift(2, 1));
    System.out.println("leftShift of 5 by 1: " + Bitwise.leftShift(5, 1));
    System.out.println("leftShift of 4 by 1: " + Bitwise.leftShift(4, 1));

    System.out.println("leftShift of 1 by 2: " + Bitwise.leftShift(1, 2));
    System.out.println("leftShift of 2 by 2: " + Bitwise.leftShift(2, 2));
    System.out.println("leftShift of 5 by 2: " + Bitwise.leftShift(5, 2));
    System.out.println("leftShift of 4 by 2: " + Bitwise.leftShift(4, 2));
    System.out.println("--------------------------------------------------");

    System.out.println("rightShift of 1 by 2: " + Bitwise.rightShift(1, 1));
    System.out.println("rightShift of 2 by 2: " + Bitwise.rightShift(2, 1));
    System.out.println("rightShift of 5 by 2: " + Bitwise.rightShift(5, 1));
    System.out.println("rightShift of 4 by 2: " + Bitwise.rightShift(4, 1));

    System.out.println("rightShift of 1 by 2: " + Bitwise.rightShift(1, 2));
    System.out.println("rightShift of 2 by 2: " + Bitwise.rightShift(2, 2));
    System.out.println("rightShift of 5 by 2: " + Bitwise.rightShift(5, 2));
    System.out.println("rightShift of 4 by 2: " + Bitwise.rightShift(4, 2));
    System.out.println("--------------------------------------------------");

    System.out.println("xor of 1 and 2: " + Bitwise.xor(1, 2));
    System.out.println("xor of 2 and 2: " + Bitwise.xor(2, 2));
    System.out.println("xor of 2 and 4: " + Bitwise.xor(2, 4));

    System.out.println("xor of 1 and 3: " + Bitwise.xor(1, 3));
    System.out.println("xor of 5 and 2: " + Bitwise.xor(5, 2));
    System.out.println("xor of 4 and 2: " + Bitwise.xor(4, 2));
    System.out.println("--------------------------------------------------");

    System.out.println("ior of 1 and 2: " + Bitwise.ior(1, 2));
    System.out.println("ior of 2 and 2: " + Bitwise.ior(2, 2));
    System.out.println("ior of 2 and 4: " + Bitwise.ior(2, 4));

    System.out.println("ior of 1 and 3: " + Bitwise.ior(1, 3));
    System.out.println("ior of 5 and 2: " + Bitwise.ior(5, 2));
    System.out.println("ior of 4 and 2: " + Bitwise.ior(4, 2));
  }
}
