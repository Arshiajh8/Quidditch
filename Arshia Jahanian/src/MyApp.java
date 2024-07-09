public class MyApp {

    public static void main(String[] args) {
        // Create teams with players
        Team team1 = new Team("Gryffindor");
        Team team2 = new Team("Slytherin");

        // Start the match
        Match match = new Match(team1, team2);
        match.start();
    }
}