class Person {
  private static String region = "Asia";
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Harry", 20);
    System.out.println(person);
  }
}
