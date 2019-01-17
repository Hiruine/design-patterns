package structural.flyweight;

public class Demo {

    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        Factory f = new Factory(ROWS);
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                f.getFlyweight(i).print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
