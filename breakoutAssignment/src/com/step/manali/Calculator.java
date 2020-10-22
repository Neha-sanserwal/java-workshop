package com.step.manali;

public class Calculator {
  private double value;

  public Calculator() {
    value = 0.0;
  }

  public double add(double value) {
    this.value += value;
    return this.value;
  }

  public double multiply(double value) {
    this.value *= value;
    return this.value;
  }

  public double reset() {
    this.value = 0.0;
    return this.value;
  }

  public double reset(double value) {
    this.value = 0.0;
    return this.value;
  }
}
