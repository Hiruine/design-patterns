package structural.bridge;

public class Png extends Image{

    @Override
    public void init() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge.Png.init()");
        platform.draw();
    }

}