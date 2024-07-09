class Chaser extends Player implements Success {
    private static final double SCORE_CHANCE = 0.3; // 30% chance to score a goal

    public Chaser(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        return Math.random() < SCORE_CHANCE;
    }
}