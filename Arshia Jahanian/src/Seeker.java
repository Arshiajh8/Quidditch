class Seeker extends Player implements Success {
    private static final double SNITCH_CHANCE = 0.05; // 5% chance to find the snitch

    public Seeker(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        return Math.random() < SNITCH_CHANCE;
    }
}