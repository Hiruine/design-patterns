
package behavioral.iterator;


public interface Collection<T> {
    Iterator createIterator();
    void add(T element);
    int getLength();
}
