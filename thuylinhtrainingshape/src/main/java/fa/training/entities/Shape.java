package fa.training.entities;

public interface Shape {
    int calculatePerimeter();

    int calculateArea();

    int getLength();

    int getWidth();

    void setLengthWidth(int length, int width);
}
