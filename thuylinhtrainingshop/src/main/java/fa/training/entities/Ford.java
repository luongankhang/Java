package fa.training.entities;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.regularPrice - manufacturerDiscount;
    }
}
