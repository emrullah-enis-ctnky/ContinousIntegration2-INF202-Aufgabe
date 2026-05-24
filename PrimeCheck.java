public class PrimeCheck {
  /**
   * @param number that is tested
   * @return true if number is prime, false otherwise
   */
  public static boolean isPrime(int number) {
    // trivial reject
    if (number < 2) {
      return false;
    }
    // 2 is prime by definition
    if (number == 2) {
      return true;
    }
    // check even numbers
    if (number % 2 == 0) {
      return false;
    }
    // check odd numbers
    for (int i = 3; (i * i) <= number; ++i) {
      if (number % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 50; ++i) {
      if (isPrime(i))
        System.out.println(i + " is prime");
    }
  }
}
