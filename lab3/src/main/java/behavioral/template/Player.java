
package behavioral.template;


public class Player {

    private AudioTemplate audioTemplate;

    public void setAudioTemplate(AudioTemplate audioTemplate) {
        this.audioTemplate = audioTemplate;
    }

    public void play() {
        audioTemplate.play();
    }

}
