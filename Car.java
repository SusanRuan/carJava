// Create a superclass called Car in JAVA. The Car class has the following fields and methods:

// int speed;
// double regularPrice;
// String color;
// double getSalePrice()



public class Car {
  int speed;
  double regularPrice;
  String color;

  public Car(int speed, double regularPrice, String color) {
      this.speed = speed;
      this.regularPrice = regularPrice;
      this.color = color;
  }

  double getSalePrice() {
      return regularPrice;
  }
}







