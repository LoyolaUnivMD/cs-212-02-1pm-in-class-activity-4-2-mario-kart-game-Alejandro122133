// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments
public class MarioKartPlayer {
    private String player_name;
    public String character;
    public int speed;

    public MarioKartPlayer(String player_name, String character, int speed){
        this.player_name = player_name;
        this.character = character;
        this.speed = speed;
    }

    //Default Constructor
    public MarioKartPlayer(){
        this.player_name = "Unknown";
        this.character = "Unknown";
        this.speed = 0;
    }

    public void boost(){
        System.out.println(player_name + " gets a speed boost!" );
    }
}

