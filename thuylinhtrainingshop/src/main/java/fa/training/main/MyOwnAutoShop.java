package fa.training.main;

import fa.training.entities.Car;
import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(100, 20000, "Red", 25);
        Sedan sedan2 = new Sedan(120, 25000, "Blue", 15);

        Ford ford1 = new Ford(140, 30000, "Black", 2018, 5000);
        Ford ford2 = new Ford(130, 35000, "White", 2020, 6000);

        Truck truck1 = new Truck(80, 40000, "Green", 2200);
        Truck truck2 = new Truck(90, 45000, "Yellow", 1800);

        Car[] cars = {sedan1, sedan2, ford1, ford2, truck1, truck2};

        for (Car car : cars) {
            System.out.println("Sale Price: " + car.getSalePrice());
        }
    }
}
