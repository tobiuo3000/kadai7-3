import java.util.ArrayList;

class PrimesArray {
  public static void main(String[] args) {
    int[] xs = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ArrayList<Integer> rs = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      if (Prime.isPrime(xs[i])) {
        rs.add(xs[i]);
      }
    }

    System.out.println(rs.size());
  }
}
