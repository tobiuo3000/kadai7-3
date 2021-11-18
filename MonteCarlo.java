import java.util.stream.IntStream;

class MonteCarlo {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    long t1 = System.currentTimeMillis();

    long hit =  IntStream.range(0, num).boxed()
    .parallel()
    .map(n -> new Point(0.0, 1.0, 0.0, 1.0))
    .filter(p -> p.getX() * p.getX() + p.getY() * p.getY() < 1.0)
    .map(p -> { return 1; })
    .reduce(0, (a, b) -> a + b);
    
    
    // fill in here hahaha
    
    
    double pi = 4.0 * hit / num; // fill in here

    long t2 = System.currentTimeMillis();
    System.out.println(pi);
    System.out.println((t2 - t1) + "ms");
  }
}
