package Volume;

public class Gallon {
    private final int gallon;

    public Gallon(int gallon) {
        this.gallon = gallon;
    }

    public Volume toLiters() {
        return new Volume(this.gallon * 3.78);
    }
}
