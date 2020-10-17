class StringMethods {

  public static void charIndex() {
    String StringRef = new String("String Reference");

    System.out.println(StringRef.charAt(1));
    System.out.println(StringRef.charAt(0));
    System.out.println(StringRef.charAt(5));
  }

  public static void codePoint() {
    String StringRef = new String("String Reference");
    System.out.println(StringRef.codePointAt(1));
    System.out.println(StringRef.codePointAt(0));
    System.out.println(StringRef.codePointAt(5));
  }

  public static void codePointBefore() {
    String StringRef = new String("String Reference");
    System.out.println(StringRef.codePointBefore(1));
    System.out.println(StringRef.codePointBefore(4));
    System.out.println(StringRef.codePointBefore(5));
  }
}

public class OtherStringMethods {

  public static void main(String[] args) {
    StringMethods.charIndex();
    StringMethods.codePoint();
    StringMethods.codePointBefore();
  }
}
