class Person {
  private String name;
  private int age;

  Person() {
    this.name = "baby";
    this.age = 0;
  }

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

  @Override
  public String toString() {
    return "Person : name : " + this.name + ", age : " + this.age;
  } //use override to avoid the mistake in method name or parameters

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Person)) {
      return false;
    }
    if (other == this) {
      return true;
    }
    Person otherPerson = (Person) other;
    if (this.age == otherPerson.age && this.name == otherPerson.name) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hashNum = 13;
    int hash = hashNum;
    hash = hash + (hashNum * ((Integer) this.age).hashCode());
    hash = hash + (hashNum * this.name.hashCode());
    return hash;
  }
}

public class Main {

  public static void main(String[] args) {
    Person uncle = new Person("Raju", 40);
    Person mamu = new Person("Raju", 40);
    Person chotu = new Person("Chotu", 12);
    Person baby = new Person();
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
    //to String has same output as printing of the references : By default when printing the object, toString() is called. It is inherited from Somewhere.

    System.out.println("--------------------------------------------------");

    // Everything in java is object
    Object someObject = new Object();
    System.out.println(someObject);
    System.out.println(someObject.toString());
    // to String in every class is inherited from object class. It is suggested to be overridden.

    System.out.println("--------------------------------------------------");
    //Object.equals
    System.out.println("mamu equals to uncle :" + mamu.equals(uncle));
    System.out.println("mamu equals to chotu :" + mamu.equals(chotu));
    System.out.println("mamu equals to  mamu :" + mamu.equals(mamu));
    System.out.println("mamu equals to 2 :" + mamu.equals(2));

    //equals gives true if Object is equal to the obj in argument. Can be overridden.

    System.out.println("--------------------------------------------------");

    System.out.println(baby.toString());

    System.out.println("--------------------------------------------------");

    //hashcode
    System.out.println("Uncle hashcode : " + uncle.hashCode());
    System.out.println("mamu hashcode : " + mamu.hashCode());
    System.out.println("Chotu hashcode : " + chotu.hashCode());
    System.out.println("ChotuCopy hashcode : " + chotuCopy.hashCode());
  }
}
