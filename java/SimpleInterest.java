import java.util.Scanner;

class Machine {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer to calculate its factorial: ");
    int n = input.nextInt();

    if (n >= 0) {
      System.out.println("Factorial of " + n + ": " + calculateFactorial(n));
    } else {
      System.out.println("Invalid input. Factorial can only be calculated for non-negative integers.");
    }

    System.out.print("Enter an integer to print all prime numbers less than it: ");
    int limit = input.nextInt();

    if (limit >= 2) {
      System.out.println("Prime numbers less than " + limit + ": ");
      printPrimes(limit);
    } else {
      System.out.println("Invalid input. The number should be greater than or equal to 2 to find prime numbers.");
    }
  }

  public static long calculateFactorial(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void printPrimes(int limit) {
    for (int i = 2; i < limit; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
