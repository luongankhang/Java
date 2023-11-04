package fa.training.entities;

public class Rectangle implements Shape {
    private int length;
    private int width;

    @Override
    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setLengthWidth(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
