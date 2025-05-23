package Shapes;

public  class Square implements ClosedShape {

    private final int side;

    public Square(int i) {
        this.side = i;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }

    @Override
    public int perimeter() {
        return 4*this.side;
    }
}
