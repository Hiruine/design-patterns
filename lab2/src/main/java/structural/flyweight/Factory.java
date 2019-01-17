package structural.flyweight;

public class Factory {

    private Item[] pool;

    public Factory(int howManyRows) {
        this.pool = new Item[howManyRows];
    }

    public Item getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Item(row);
        }
        return pool[row];
    }

}
