import java.util.stream.IntStream;

class PrintInts {
  public static void main(String[] args) {
    System.out.println(
      IntStream.range(1, Integer.parseInt(args[0]) + 1).boxed()
        .parallel()
        .map(n -> { System.out.println(n); return n; })
        .reduce(0, (a, b) -> a + b)
    );
  }
}
