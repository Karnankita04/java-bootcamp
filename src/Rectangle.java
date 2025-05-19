public class Rectangle implements ClosedShape {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }

    @Override
    public int perimeter() {
        return 2 * (this.height+this.width);
    }
}
