class Person {
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private boolean isOlderThanOrEqual(int ageLimit) {
    return this.age >= ageLimit;
  }

  public boolean isEligibleToVote() {
    return isOlderThanOrEqual(18);
  }

  public boolean canBuyADrink() {
    return isOlderThanOrEqual(21);
  }
}

public class Main {

  public static void main(String[] args) {
    Person uncle = new Person("Raju", 40);
    Person chotu = new Person("Chotu", 12);

    System.out.println("uncle can vote : " + uncle.isEligibleToVote());
    System.out.println("uncle can buy a drink : " + uncle.canBuyADrink());

    System.out.println("chotu can vote : " + chotu.isEligibleToVote());
    System.out.println("chotu can buy a drink : " + chotu.canBuyADrink());
  }
}
