public class Kata {
    public static String rpsls(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if ((p1.equals("rock") && p2.equals("scissors")) ||
                   (p1.equals("scissors") && p2.equals("paper")) ||
                   (p1.equals("lizard") && p2.equals("spock")) ||
                   (p1.equals("spock") && p2.equals("scissors")) ||
                   (p1.equals("paper") && p2.equals("rock")) ||  
                   (p1.equals("scissors") && p2.equals("lizard")) ||
                   (p1.equals("rock") && p2.equals("lizard")) ||
                   (p1.equals("paper") && p2.equals("spock")) ||
                   (p1.equals("spock") && p2.equals("rock")) ||
                   (p1.equals("lizard") && p2.equals("paper"))) {
            return "Player 1 Won!";
        } else {
            return "Player 2 Won!";
        }
    }
}