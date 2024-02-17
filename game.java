import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name player 1?");
        String player1_name = input.nextLine();
        System.out.println("What is your name player 2?");
        String player2_name = input.nextLine();

        System.out.println("Player 1 do you want to be Mario or Luigi?");
        String character1 = input.nextLine();
        String character2 = "";
        int speed1 = 0;
        int speed2 = 0;

        if (character1.equals("Mario")) {
            character2 = "Luigi";
            speed1 = 100;
            speed2 = 80;
        } else if (character1.equals("Luigi")) {
            character2 = "Mario";
            speed1 = 80;
            speed2 = 100;
        } else {
            System.out.println("Invalid character choice. Exiting the game.");
            System.exit(0);
        }


        MarioKartPlayer player1 = new MarioKartPlayer(player1_name, character1, speed1);
        MarioKartPlayer player2 = new MarioKartPlayer(player2_name, character2, speed2);

        System.out.println(player1_name + " is " + character1);
        System.out.println(player2_name + " is " + character2);
        System.out.println(player1_name + " is going " + speed1 + "mph ");
        System.out.println(player2_name + " is going " + speed2 + "mph ");

        player1.boost();
        player2.boost();

    }
}