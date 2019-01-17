package structural.facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Drive drive;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.drive = new Drive();
    }

    public void run() {
        cpu.processData();
        memory.load();
        drive.storeData();
    }
}
