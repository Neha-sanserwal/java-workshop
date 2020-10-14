public class Calculator {

  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static int subtraction(int num1, int num2) {
    return num1 - num2;
  }

  public static int divide(int num1, int num2) {
    return num1 / num2;
  }

  public static void main(String[] args) {
    int choice = Integer.parseInt(args[0]);
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);
    switch (choice) {
      case 1:
        System.out.println("The result is: " + add(num1, num2));
        System.out.println();
        break;
      case 2:
        System.out.println("The result is: " + multiply(num1, num2));
        break;
      case 3:
        System.out.println("The result is: " + subtraction(num1, num2));
        break;
      case 4:
        System.out.println("The result is: " + divide(num1, num2));
        break;
      default:
        System.out.println("Enter valid input between 1 to 4");
        break;
    }
  }
}
