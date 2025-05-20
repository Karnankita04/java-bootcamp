package probability;

import java.util.Objects;

public class Probability {


    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability createProbability(double probability) {
        if (probability < 0 || probability > 1) {
            throw new RuntimeException("Invalid probability");
        }

        return new Probability(probability);
    }

    public Probability and(Probability other) {
        return new Probability(probability * other.probability);
    }

    public Probability complement() {
        return new Probability(1 - this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public String toString() {
        return "Probability{" +
                "probability=" + probability +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }


    public Probability or(Probability other) {
        return new Probability(probability + other.probability - this.and(other).probability);
        //!(!p(a) && !p(b)
    }

}
//change names