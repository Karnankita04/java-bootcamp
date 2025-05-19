package probability;

public class FlipCoin {
    private final int favourable;
    private final int totalOutcome;

    public FlipCoin(int favourable, int totalOutcome) {
        this.favourable = favourable;
        this.totalOutcome = totalOutcome;
    }

    public double tailsProbability() {
        return (double) this.favourable / this.totalOutcome;
    }

    public double notGettingTails() {
        return 1 - this.tailsProbability();
    }
}
