import java.util.ArrayList;
import java.util.stream.*;

class PrimesStream {
  public static void main(String[] args) {
    ArrayList<Integer> xs = new ArrayList<Integer>();
    for (int i = 1; i <= 10; i++) {
      xs.add(i);
    }
    Stream<Integer> s1 = xs.stream();
    // Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Stream<Integer> s1 = IntStream.range(1, 11).boxed();

    Stream<Integer> s2 = s1.filter(n -> Prime.isPrime(n));

    System.out.println(s2.count());
    // System.out.println(s2.reduce(0, (a, b) -> a + b));
  }
}
