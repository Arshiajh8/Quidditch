class Match {
    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void start() {
        for (int round = 1; round <= 100; round++) {
            System.out.println("Round " + round);
            team1.play();
            team2.play();
            System.out.println(team1.getName() + " Goals: " + team1.getGoals());
            System.out.println(team2.getName() + " Goals: " + team2.getGoals());
        }

        if (team1.getGoals() > team2.getGoals()) {
            System.out.println(team1.getName() + " Wins!");
        } else if (team2.getGoals() > team1.getGoals()) {
            System.out.println(team2.getName() + " Wins!");
        } else {
            System.out.println("The match ends in a draw!");
        }
    }
}
