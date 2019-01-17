
package behavioral.command;


public class PlayMusicCommand implements CommandListener {
    Player p;

    public PlayMusicCommand(Player p) {
        this.p = p;
    }
    
    @Override
    public void execute() {
        System.out.println("PlayMusicCommand.execute()");
        p.playAudio();
    }

}
