
package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;


public class Array<T> implements Collection<T> {

    private List<T> array;
    private int position = 0;

    public Array(int size) {
        array = new ArrayList<>(size);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(array, position);
    }

    @Override
    public void add(T element) {
        array.add(position++, element);
    }

    @Override
    public int getLength() {
        return position;
    }

}
