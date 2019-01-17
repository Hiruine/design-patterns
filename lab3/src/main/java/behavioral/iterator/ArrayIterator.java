
package behavioral.iterator;

import java.util.List;


public class ArrayIterator<T> implements Iterator<T> {

    private List<T> ref = null;
    private int position = 0;
    private int size = 0;

    public ArrayIterator(List<T> ref, int size) {
        this.ref = ref;
        this.size = size;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public void next() {
        ++position;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public T currentItem() {
        return ref.get(position);
    }

}
