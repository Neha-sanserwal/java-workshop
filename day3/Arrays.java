public class Arrays {

  public static int isElementPresent(int[] numbers, int numberToFind) {
    if (numbers == null) return -1;
    for (int numIndex = 0; numIndex < numbers.length; numIndex++) {
      if (numbers[numIndex] == numberToFind) return numIndex;
    }
    return -1;
  }

  public static int isElementPresent(int[][] numbers, int numberToFind) {
    if (numbers == null) return -1;
    for (int row = 0; row < numbers.length; row++) {
      for (int cell = 0; cell < numbers[row].length; cell++) {
        if (numbers[row][cell] == numberToFind) {
          return (row + 1) * (cell + 1);
        }
      }
    }
    return -1;
  }

  public static int[][] cloneArray(int[][] values) {
    int[][] clone = new int[values.length][];
    for (int row = 0; row < values.length; row++) {
      clone[row] = new int[values[row].length];
      for (int cell = 0; cell < values[row].length; cell++) {
        clone[row][cell] = values[row][cell];
      }
    }
    return clone;
  }

  public static int[] cloneArray(int[] values) {
    int[] clone = new int[values.length];
    for (int index = 0; index < values.length; index++) {
      clone[index] = values[index];
    }
    return clone;
  }

  public static float average(int[] numbers) {
    int sum = 0;
    if (numbers == null) return sum;
    for (int number : numbers) {
      sum += number;
    }
    return sum / numbers.length;
  }

  public static int[] sort(int[] numbers) {
    int[] numbersCopy = cloneArray(numbers);
    for (int numIdx = 1; numIdx < numbersCopy.length; numIdx++) {
      for (int prevIdx = 0; prevIdx < numIdx; prevIdx++) {
        if (numbersCopy[prevIdx] > numbersCopy[numIdx]) {
          numbersCopy[prevIdx] = numbersCopy[prevIdx] + numbersCopy[numIdx];
          numbersCopy[numIdx] = numbersCopy[prevIdx] - numbersCopy[numIdx];
          numbersCopy[prevIdx] = numbersCopy[prevIdx] - numbersCopy[numIdx];
        }
      }
    }
    return numbersCopy;
  }

  public static boolean deepEqual(int[] numbers1, int[] numbers2) {
    if (numbers1 == numbers2) return true;
    if (numbers1 == null || numbers2 == null) return false;
    if (numbers1.length != numbers2.length) return false;
    for (int i = 0; i < numbers2.length; i++) {
      if (numbers1[i] != numbers2[i]) return false;
    }
    return true;
  }

  public static boolean isPalindrome(int[] numbers) {
    int length = numbers.length;
    for (int idx = 0; idx < length / 2; idx++) {
      if (numbers[idx] != numbers[length - 1 - idx]) return false;
    }
    return true;
  }

  public static int[][] pair(int[] numbers) {
    int limit = 2;
    int[][] pairedNumbers = new int[numbers.length / 2][limit];
    for (int row = 0; row < pairedNumbers.length; row++) {
      for (int cell = 0; cell < limit; cell++) {
        pairedNumbers[row][cell] = numbers[row * limit + cell];
      }
    }
    return pairedNumbers;
  }

  public static void printArray(int[] numbers) {
    System.out.println("--------------------------------");

    for (int number : numbers) {
      System.out.print(number);
      System.out.print(' ');
    }
    System.out.println();
    System.out.println("--------------------------------");
  }

  public static void main(String[] args) {
    int[] numbers1 = { 1, 2, 3 };
    int[] numbers2 = { 4, 5, 6 };
    int[] unsortedArray1 = { 3, 2, 1 };
    int[] unsortedArray2 = { 5, 6, 3, 2 };
    int[] palindrome = { 1, 2, 1 };
    int[] nonPalindrome = { 1, 2, 3, 4 };
    int[] flatArray = { 1, 2, 3, 4, 5, 6 };

    int[][] twoDArray = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

    //If element present
    System.out.println(isElementPresent(numbers1, 2));
    System.out.println(isElementPresent(numbers2, 1));
    // System.out.println(isElementPresent(null, 1)); // ambiguous reference to method;

    System.out.println(isElementPresent(twoDArray, 5));
    System.out.println(isElementPresent(twoDArray, 4));
    System.out.println(isElementPresent(twoDArray, 10));

    // Average
    System.out.println(average(numbers1));
    System.out.println(average(numbers2));
    System.out.println(average(null));

    //sort
    printArray(sort(unsortedArray1));
    printArray(sort(unsortedArray2));
    printArray(sort(numbers1));

    System.out.println(deepEqual(numbers1, numbers2));
    System.out.println(deepEqual(numbers2, numbers2));
    System.out.println(deepEqual(numbers1, null));

    System.out.println("is Palindrome " + isPalindrome(palindrome));
    System.out.println("is Palindrome " + isPalindrome(nonPalindrome));
    for (int[] row : pair(flatArray)) {
      printArray(row);
    }
  }
}
