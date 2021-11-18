class Prime {
  static boolean divides(int n, int m) {
    return n % m == 0;
  }

  static int smallestDivisor(int n, int m) {
    if (m * m > n) return n;
    else if (divides(n, m)) return m;
    else return smallestDivisor(n, m + 1);
  }

  static int smallestDivisor(int n) {
    return smallestDivisor(n, 2);
  }

  static boolean isPrime(int n) {
    return n > 1 && smallestDivisor(n) == n;
  }
}
