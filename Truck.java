// Create a subclass of the Car class and name it Truck. The Truck class has the following fields and methods.

// int weight;
// double getSalePrice(); 
// for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.


public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        double discountPrice;
        if (weight > 2000) {
            //10% discount
            discountPrice = super.regularPrice * 0.10;
        } else {
            //20% discount
            discountPrice = super.regularPrice * 0.20;
        }
        return super.regularPrice - discountPrice;
    }
}