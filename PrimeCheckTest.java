import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* Asal olan sayilari test ediyoruz */
    assertEquals("Test prime 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test prime 5", true, PrimeCheck.isPrime(5));
    assertEquals("Test prime 7", true, PrimeCheck.isPrime(7));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* Asal OLMAYAN sayilari test ediyoruz */
    assertEquals("Test non-prime 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test non-prime 6", false, PrimeCheck.isPrime(6));
    assertEquals("Test non-prime 9", false, PrimeCheck.isPrime(9));
  }
}
