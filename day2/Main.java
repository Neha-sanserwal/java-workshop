class Person {
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public boolean isEligibleForVote() {
    return this.age >= 18;
  }
}

public class Main {

  public static void main(String[] args) {
    Person person = new Person(args[0], Integer.parseInt(args[1]));
    if (person.isEligibleForVote()) {
      System.out.println("Person can vote");
    } else {
      System.out.println("Person cannot vote");
    }
  }
}
