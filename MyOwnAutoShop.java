// Create MyOwnAutoShop class which contains the main() method. Perform the following within the main() method.

// Create an instance of the Sedan class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
// Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the super class.
// Create an instance of the Car class and initialize all the fields with appropriate values. Display the sale prices of all instances.


public class MyOwnAutoShop {
  public static void main(String[] args) {
      Sedan camry = new Sedan(160, 30000, "blue", 15);
      System.out.println("Camry Sedan");
      System.out.println("The current price for Toyota Camry is $" + camry.regularPrice);
      System.out.println("The top speed of this model is " + camry.speed);
      System.out.println("With the current promotion of 10% off, the Toyota Camry can be yours for only $" + camry.getSalePrice());
      System.out.println("You bought a  new " + camry.color + " Toyota Camry!");


      Ford mustang500 = new Ford(200, 87000, "fire engine red", 2023, .05);
      System.out.println();
      System.out.println("Ford Shelby");
      System.out.println("You are looking at the all new " + mustang500.year + " Shelby 500 in " + mustang500.color);
      System.out.println("The current price of this beast is $" + mustang500.regularPrice);
      System.out.println("It tops out at  " + mustang500.speed + " MPH with 880 horses");
      System.out.println("With the manufacturer's discount of 5% off, this pony comes out to $" + mustang500.getSalePrice());


      Ford mustangV6 = new Ford(160, 32000, "black", 2022, .10);
      System.out.println();
      System.out.println("Ford V6");
      System.out.println("You are looking at the " + mustangV6.year + " Ford Mustang in " + mustangV6.color);
      System.out.println("Currently going for $" + mustangV6.regularPrice + " with a top speed of " + mustangV6.speed);
      System.out.println("It comes out to " + mustangV6.getSalePrice() + " with the 10% manufacturer's discount");

      Car jetta = new Car(140, 24000, "silver");
      System.out.println();
      System.out.println("VW Car");
      System.out.println("This " + jetta.color + " Jetta has a top speed of " + jetta.speed + " MPH and an affordable price of $" + jetta.getSalePrice());

      Truck raptor = new Truck(120, 77000, "sunburnt orange", 5740);
      System.out.println();
      System.out.println("Ford Raptor");
      System.out.println("The " + raptor.color + " Ford Raptor weighs about " + raptor.weight + " lbs with a top speed of " + raptor.speed);
      System.out.println("The current price is " + raptor.regularPrice + " but since it is on the heavier side it gets a 10% discount which brings it to " + raptor.getSalePrice());
  }
}

