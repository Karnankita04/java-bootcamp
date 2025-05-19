public class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * (this.height+this.width);
    }
}
