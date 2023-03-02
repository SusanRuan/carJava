// Create a subclass of the Car class and name it Sedan. The Sedan class has the following fields and methods.

// int length;
// double getSalePrice(); 
// for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount


public class Sedan extends Car {
  int length;

  public Sedan(int speed, double regularPrice, String color, int length) {
      super(speed, regularPrice, color);
      this.length = length;
  }

  @Override
  double getSalePrice() {
      //If length > 20 feet, 5% discount, otherwise 10% discount
      double discount;
      if (length > 20) {
          //5% discount
          discount = super.getSalePrice() * 0.05;
      } else {
          //10% discount
          discount = super.getSalePrice() * 0.10;
      }
      return super.getSalePrice() - discount;
  }
}
