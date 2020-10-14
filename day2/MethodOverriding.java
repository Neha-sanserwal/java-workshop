class Message {

  public void greet() {
    System.out.println("Hello World");
  }

  public void greet(String name) {
    String greeting = String.format("Hello %s", name);
    System.out.println(greeting);
  }

  public void greet(String firstName, String lastName) {
    String greeting = String.format("Hello %s %s", firstName, lastName);
    System.out.println(greeting);
  }
}

public class MethodOverriding {

  public static void main(String[] args) {
    Message message = new Message();
    message.greet();
    message.greet("Neha");
    message.greet("Neha", "Sanserwal");
  }
}
