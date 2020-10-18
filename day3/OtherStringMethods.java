class StringMethods {

  public static void charIndex() {
    String stringRef = new String("String Reference");

    System.out.println(stringRef.charAt(1));
    System.out.println(stringRef.charAt(0));
    System.out.println(stringRef.charAt(5));
  }

  public static void codePoint() {
    String stringRef = new String("String Reference");
    System.out.println(stringRef.codePointAt(1));
    System.out.println(stringRef.codePointAt(0));
    System.out.println(stringRef.codePointAt(5));
  }

  public static void codePointBefore() {
    String stringRef = new String("String Reference");
    System.out.println(stringRef.codePointBefore(1));
    System.out.println(stringRef.codePointBefore(4));
    System.out.println(stringRef.codePointBefore(5));
  }

  public static void codePointCount() {
    String stringRef = new String("ssss gggggggg");
    System.out.println(stringRef.codePointCount(1, 1));
    System.out.println(stringRef.codePointCount(4, 6));
    System.out.println(stringRef.codePointCount(5, 10));
    System.out.println(stringRef.offsetByCodePoints(1, 2));
  }

  public static void getChars() {
    char[] charArr = new char[10];
    String stringRef = new String("this is a string");
    stringRef.getChars(0, 7, charArr, 0);
    for (char chr : charArr) {
      System.out.println(chr);
    }
  }

  public static void compareTo() {
    char[] charArr = new char[10];
    String string1 = new String("this is a string");
    String string2 = new String("this is a stri");
    System.out.println(string1.compareTo(string2));
  }
}

public class OtherStringMethods {

  public static void main(String[] args) {
    // StringMethods.charIndex();
    // StringMethods.codePoint();
    // StringMethods.codePointBefore();
    StringMethods.codePointCount();
    // StringMethods.getChars();
    // StringMethods.compareTo();
  }
}
