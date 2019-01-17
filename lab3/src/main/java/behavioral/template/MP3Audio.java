package behavioral.template;


public class MP3Audio extends AudioTemplate {

    @Override
    protected void parse() {
        System.out.println("MP3Audio.parse()");
    }

    @Override
    protected void decode() {
        System.out.println("MP3Audio.decode()");
    }

}
