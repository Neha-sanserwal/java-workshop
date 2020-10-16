public class Strings {

  public static void main(String[] args) {
    String ObjString = new String("Neha");
    String literalString = "Neha";
    String literalCpy = "Neha";
    String ObjCpy = new String("Neha");

    // System.out.println(ObjString == ObjCpy);
    // System.out.println(ObjString == literalString);
    // System.out.println(literalString == literalCpy);

    // System.out.println("abc" + null + 2);

    // System.out.println("abc".concat("")); // return this string;
    System.out.println("abc".concat("null")); // return this string;

    String someString = "abc";
    // String copy = someString.concat("");
    // System.out.println("is copy equals abc ? " + (copy == someString));
    // String anotherCopy = someString.concat("def");
    // System.out.println("is copy equals abc ? " + (copy == anotherCopy));

    // System.out.println("abc".concat("dsbsd"));

    System.out.println(someString.replace('g', 'j') == someString);
    // System.out.println(someString.replace('a', 'c') == someString);
    System.out.println(someString.contains(""));

    System.out.println(someString.contains("a"));
    System.out.println(someString.contains("ac"));
    System.out.println("abcdefgh123".replaceFirst("", "123"));
    System.out.println("abcdefgh123".replaceAll("", "123"));
    String[] arr = "foo and bar".split("", 2);
    System.out.println(arr.length);
    for (String element : arr) {
      System.out.println(element);
    }
    // System.out.println("abc".concat(2)); // does not work
    // System.out.println("abc".concat("dsdssd", "dssdds")); does not work;

    // System.out.println(String.valueOf("Neha"));

    CharSequence a = "abc";
    String b = "abc";
    System.out.println(a.getClass());
  }
}
