package structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        MediaPlayer player = new Mp3();
        player.play("file.mp3");

        player = new FormatAdapter((new Mp4()));
        player.play("file.mp4");

    }

}
