import java.util.ArrayList;

class PrimesArrayExtFor {
  public static void main(String[] args) {
    int[] xs = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArrayList<Integer> rs = new ArrayList<Integer>();

    for (int n : xs) {
      if (Prime.isPrime(n)) {
        rs.add(n);
      }
    }

    System.out.println(rs.size());
  }
}
