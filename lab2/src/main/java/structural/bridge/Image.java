package structural.bridge;

public abstract class Image {

    protected Platform platform;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public abstract void init();
}
