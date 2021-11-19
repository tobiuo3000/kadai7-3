import java.util.stream.*;

class EvenSum {
  static int evenSum(Stream<Integer> s) {
    // fill in here
    int i;//heyhey

    return i = s
                  .filter(n -> n % 2 == 0)
                  .reduce(0, (a, b) -> a + b);

  }
  public static void main(String[] args) {
    int i = Integer.parseInt(args[0]);
    Stream<Integer> s = IntStream.range(1, i+1).boxed();
    System.out.println("git hub, can you see it?");
    System.out.println(evenSum(s)); //sはiterator
  }
}
