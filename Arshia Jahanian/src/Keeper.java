class Keeper extends Player implements Success {
    private static final double SAVE_CHANCE = 0.7; // 70% chance to save a goal

    public Keeper(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        return Math.random() < SAVE_CHANCE; // Simulate success based on chance
    }
}
