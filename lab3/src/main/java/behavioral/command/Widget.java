
package behavioral.command;


public class Widget {
    private CommandListener l;

    public void setListener(CommandListener l) {
        this.l = l;
    }

    public void clickPlayButton(){
        System.out.println("Widget.clickPlayButton()");
        l.execute();
    }
    
}
