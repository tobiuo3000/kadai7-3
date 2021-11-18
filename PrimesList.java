import java.util.ArrayList;

class PrimesList {
  public static void main(String[] args) {
    ArrayList<Integer> xs = new ArrayList<Integer>();
    ArrayList<Integer> rs = new ArrayList<Integer>();

    for (int i = 1; i <= 10; i++) {
      xs.add(i);
    }

    for (int i = 0; i < 10; i++) {
      Integer n = xs.get(i);
      if (Prime.isPrime(n)) {
        rs.add(n);
      }
    }

    System.out.println(rs.size());
  }
}
