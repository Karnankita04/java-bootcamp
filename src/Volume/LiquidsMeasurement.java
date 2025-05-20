package Volume;

public class LiquidsMeasurement {
    private final Gallon gallon;
    private final Volume liters;

    public LiquidsMeasurement(Gallon gallon, Volume liters) {
        this.gallon = gallon;
        this.liters = liters;
    }

    public boolean compare() {
        return this.gallon.toLiters().equals(liters);
    }
}

