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
    Person mamu = new Person("Raju", 40);
    Person chotu = new Person("Chotu", 12);
    Person chotuCopy = chotu;

    System.out.println("uncle can vote : " + uncle.isEligibleToVote());
    System.out.println("uncle can buy a drink : " + uncle.canBuyADrink());

    System.out.println("--------------------------------------------------");

    System.out.println("chotu can vote : " + chotu.isEligibleToVote());
    System.out.println("chotu can buy a drink : " + chotu.canBuyADrink());

    System.out.println("--------------------------------------------------");

    // if instances are equal
    System.out.println("chotu equals chotuCopy :" + (chotuCopy == chotu));
    System.out.println("chotu equals uncle :" + (uncle == chotu));
    System.out.println("mamu equals uncle :" + (uncle == mamu));
    // even having same values in fields doesn't make it equal

    System.out.println("--------------------------------------------------");

    //references of each instance
    System.out.println("Uncle : " + uncle);
    System.out.println("mamu : " + mamu);
    System.out.println("Chotu : " + chotu);
    System.out.println("ChotuCopy : " + chotuCopy);
    //references of each instance is  different

    System.out.println("--------------------------------------------------");

    //toStrings
    System.out.println("Uncle : " + uncle.toString());
    System.out.println("mamu : " + mamu.toString());
    System.out.println("Chotu : " + chotu.toString());
    System.out.println("ChotuCopy : " + chotuCopy.toString());
    //to String has same output as print the reference : By default when printing the object toString() is called. It inherit from Somewhere

    System.out.println("--------------------------------------------------");
  }
}
