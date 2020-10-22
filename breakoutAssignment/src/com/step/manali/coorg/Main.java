package com.step.manali.coorg;

import com.step.coorg.Calculator;

public class Main {

  public static void main(String[] args) {
    System.out.println("Manali -> Coorg");
    Calculator calculator = new Calculator();
    System.out.println("Adding 1 to Calculator: " + calculator.add(1));
    System.out.println("Adding 5 to Calculator: " + calculator.add(5));

    System.out.println(
      "Multiplying 2 to Calculator: " + calculator.multiply(2)
    );
    System.out.println(
      "Multiplying 5 to Calculator: " + calculator.multiply(5)
    );

    System.out.println("Re-setting calculator to: " + calculator.reset());
    // System.out.println("Re-setting calculator to: " + calculator.reset(6));
  }
}
