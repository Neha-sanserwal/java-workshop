public class Collatz {

  public static Boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static int getNextCollatzNo(int num) {
    if (Collatz.isEven(num)) {
      return num / 2;
    }
    return 3 * num + 1;
  }

  public static void main(String[] args) {
    int collatzNo = Integer.parseInt(args[0]);
    while (collatzNo != 1) {
      System.out.println(collatzNo);
      collatzNo = Collatz.getNextCollatzNo(collatzNo);
    }
    System.out.println(collatzNo);
  }
}
