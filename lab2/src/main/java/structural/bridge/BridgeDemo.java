package structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Image i = new Png();
        i.setPlatform(new Windows());
        i.init();
        i.setPlatform(new MacOs());
        i.init();
    }
}
