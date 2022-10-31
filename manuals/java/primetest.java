public class PrimeTest {

  public static void main(String[] args) {
    for (int i = 1; i < 200; i++) {
      if (is_prime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static boolean is_prime(int x) {
    if (x == 1 || x % 2 == 0 && x != 2) {
      return false;
    } else {
      for (int i = 3; i <= Math.sqrt(x); i += 2) {
        if (x % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
