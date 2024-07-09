class Beater extends Player implements Success {
    private static final double STOP_CHANCE = 0.4; // 40% chance to stop chasers

    public Beater(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        return Math.random() < STOP_CHANCE;
    }
}