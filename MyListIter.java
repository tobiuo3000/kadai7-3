import java.util.Iterator;

class MyIterator implements Iterator<Integer> {
  Integer[] is;
  int nextIndex;

  MyIterator(Integer[] is) {
    this.is = is;
    nextIndex = 0;
  }

  public boolean hasNext() {
    return nextIndex < is.length;
  }

  public Integer next() {
    return is[nextIndex++];
  }
}

class MyListIter implements Iterable<Integer> {
  Integer[] is;

  MyListIter(int size) {
    is = new Integer[size];
    for(int i = 0; i < size; i++) {
      is[i] = i + 1;
    }
  }

  public Iterator<Integer> iterator() {
    return new MyIterator(is);
  }
}
