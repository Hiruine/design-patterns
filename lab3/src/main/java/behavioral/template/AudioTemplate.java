package behavioral.template;


public abstract class AudioTemplate {

    protected abstract void parse();

    protected abstract void decode();

    public void play() {
        parse();
        decode();
    }

}
