package structural.adapter;

public class FormatAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Adapter is used");
        mediaPackage.playFile(fileName);
    }
}
