class Team {
    private String name;
    private Player[] players;
    private int goals;

    public Team(String name) {
        this.name = name;
        players = new Player[] {
                new Keeper(name + " Keeper", 1),
                new Seeker(name + " Seeker", 2),
                new Chaser(name + " Chaser1", 3),
                new Chaser(name + " Chaser2", 4),
                new Chaser(name + " Chaser3", 5),
                new Beater(name + " Beater1", 6),
                new Beater(name + " Beater2", 7)
        };
        goals = 0;
    }

    public String getName() {
        return name;
    }

    private void setGoal() {
        goals++;
    }

    public int getGoals() {
        return goals;
    }

    public void play() {
        int successfulBeaters = 0;
        int successfulChasers = 0;
        boolean keeperSuccessful = false;

        for (Player player : players) {
            if (player instanceof Beater && ((Beater) player).isSuccessful()) {
                successfulBeaters++;
            } else if (player instanceof Chaser && ((Chaser) player).isSuccessful()) {
                successfulChasers++;
            } else if (player instanceof Keeper && ((Keeper) player).isSuccessful()) {
                keeperSuccessful = true;
            } else if (player instanceof Seeker && ((Seeker) player).isSuccessful()) {
                System.out.println(name + " Seeker " + player.getName() + " found the Snitch! " + name + " Wins!");
                System.exit(0); // Exit the program on Snitch find
            }
        }

        if (keeperSuccessful && successfulBeaters >= 1 && successfulChasers >= 2) {
            setGoal();
        }
    }
}