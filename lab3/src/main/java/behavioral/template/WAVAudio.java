
package behavioral.template;


public class WAVAudio extends AudioTemplate {

    @Override
    protected void parse() {
        System.out.println("WAVAudio.parse()");
    }

    @Override
    protected void decode() {
        System.out.println("WAVAudio.decode()");
    }

}
