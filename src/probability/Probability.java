package probability;

import java.util.Objects;

public class Probability {


    private final double v;

    private Probability(double v) {
        this.v = v;
    }

    public static Probability createProbability(double v) {
        if(v < 0 || v > 1) {
            throw new RuntimeException("Invalid probability");
        }

        return new Probability(v);
    }

    public Probability and(Probability probability2) {
        return new Probability(v * probability2.v);
    }

    public Probability complement() {
        return new Probability(1 - this.v);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(v, that.v) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(v);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "v=" + v +
                '}';
    }

//    public Probability and(Probability other) {
//        return new Probability(v * other.v);
//    }
}
//change names