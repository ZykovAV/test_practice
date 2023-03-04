import java.util.ArrayList;
import java.util.List;

public class Rpsls {
    public static String rpsls(String player1, String player2){
        switch (player1) {
            case ("rock") :
                if (player2.equals("rock")) {
                    return "Draw!";
                }
                if (player2.equals("paper")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("scissors")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("lizard")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("spock")) {
                    return "Player 2 Won!";
                }
            case ("paper") :
                if (player2.equals("rock")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("paper")) {
                    return "Draw!";
                }
                if (player2.equals("scissors")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("lizard")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("spock")) {
                    return "Player 1 Won!";
                }
            case ("scissors") :
                if (player2.equals("rock")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("paper")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("scissors")) {
                    return "Draw!";
                }
                if (player2.equals("lizard")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("spock")) {
                    return "Player 2 Won!";
                }
            case ("lizard") :
                if (player2.equals("rock")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("paper")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("scissors")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("lizard")) {
                    return "Draw!";
                }
                if (player2.equals("spock")) {
                    return "Player 1 Won!";
                }
            case ("spock") :
                if (player2.equals("rock")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("paper")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("scissors")) {
                    return "Player 1 Won!";
                }
                if (player2.equals("lizard")) {
                    return "Player 2 Won!";
                }
                if (player2.equals("spock")) {
                    return "Draw!";
                }
        }
        // Your code here!
        return "Error";
    }

    public static void main(String[] args) {
        String s = rpsls("spock", "scissors");
        System.out.println(s);
    }
}
