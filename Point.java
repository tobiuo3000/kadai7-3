import java.util.concurrent.ThreadLocalRandom;

class Point {
  double x, y;
  static ThreadLocalRandom random = ThreadLocalRandom.current();

  Point(double lowX, double highX, double lowY, double highY) {
    x = random.nextDouble(lowX, highX);
    y = random.nextDouble(lowY, highY);
  }

  double getX() { return x; }
  double getY() { return y; }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  /* test
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for(int i = 0; i < n; i++) {
      System.out.println(new Point(0.0, 1.0, -2.0, 3.0));
    }
  }
  */
}
