
package behavioral.command;


public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        Widget w = new Widget();
        w.setListener(new PlayMusicCommand(player));
        w.clickPlayButton();
    }
}
