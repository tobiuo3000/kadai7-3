import java.util.stream.*;

class StreamChainParallel {
  public static void main(String[] args) {
    int i = IntStream.range(1, Integer.parseInt(args[0])).boxed()
              .parallel()
              .filter(n -> Prime.isPrime(n))
              .map(n -> n * n)
              .reduce(0, (a, b) -> a + b);

    System.out.println(i);
  }
}
