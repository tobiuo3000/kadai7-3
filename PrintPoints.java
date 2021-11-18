import java.util.stream.IntStream;

class PrintPoints {
  public static void main(String[] args) {
    System.out.println(
      IntStream.range(0, Integer.parseInt(args[0])).boxed()
        .parallel()
        .map(n -> new Point(0.0, 1.0, 0.0, 1.0))
        .map(p -> { System.out.println(p); return 1; })
        .reduce(0, (a, b) -> a + b)
    );
  }
}
