
package behavioral.template;


public class Demo {

    public static void main(String[] args) {
        Player p = new Player();
        p.setAudioTemplate(new MP3Audio());
        p.play();
        p.setAudioTemplate(new WAVAudio());
        p.play();
    }
}
