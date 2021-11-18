import java.util.ArrayList;
import java.util.Iterator;

class PrimesListIter {
  public static void main(String[] args) {
    ArrayList<Integer> xs = new ArrayList<Integer>();
    ArrayList<Integer> rs = new ArrayList<Integer>();

    for (int i = 1; i <= 10; i++) {
      xs.add(i);
    }

    Iterator<Integer> iter = xs.iterator();

    while (iter.hasNext()) {
      Integer n = iter.next();
      if (Prime.isPrime(n)) {
        rs.add(n);
      }
    }

    System.out.println(rs.size());
  }
}
