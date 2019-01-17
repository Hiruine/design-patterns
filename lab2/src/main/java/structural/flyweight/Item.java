package structural.flyweight;

public class Item {

    private int row;

    public Item(int row) {
        this.row = row;
        System.out.println("Rows : " + row);
    }

    public void print(int col) {
        System.out.print(" " + row + col);
    }

}
