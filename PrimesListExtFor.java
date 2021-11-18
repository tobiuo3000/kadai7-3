import java.util.ArrayList;

class PrimesListExtFor {
  public static void main(String[] args) {
    ArrayList<Integer> xs = new ArrayList<Integer>();
    ArrayList<Integer> rs = new ArrayList<Integer>();

    for (int i = 1; i <= 10; i++) {
      xs.add(i);
    }

    for (Integer n : xs) {
      if (Prime.isPrime(n)) {
        rs.add(n);
      }
    }

    System.out.println(rs.size());
  }
}
