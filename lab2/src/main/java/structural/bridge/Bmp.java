package structural.bridge;

public class Bmp extends Image {
    @Override
    public void init() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge.Bmp.init()");
        platform.draw();
    }
}
