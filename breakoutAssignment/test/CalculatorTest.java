import static org.junit.Assert.assertEquals;

import com.step.manali.Calculator;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void evaluateAdd() {
    Calculator calculator = new Calculator();
    double sum = calculator.add(5);
    double expected = 5;
    assertEquals(expected, sum, 0.00);
  }
}
