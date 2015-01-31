package test;

public class ElectricGuitar extends Guitar
{
  int    numberOfPickups;
  String type = "Electric";

  public ElectricGuitar(String brand, String model, int numberOfPickups, int numberOfStrings)
  {
    super();
    this.brand = brand;
    this.model = model;
    this.numberOfPickups = numberOfPickups;
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar()
  {
    // TODO Auto-generated constructor stub
  }

  public int getNumberOfPickups()
  {
    return numberOfPickups;
  }

  public void setNumberOfPickups(int numberOfPickups)
  {
    this.numberOfPickups = numberOfPickups;
  }

  public void showValues()
  {
    System.out.println("My Guitar:");
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Type: " + type);
    System.out.println("Number of Strings: " + numberOfStrings);
    System.out.println("Number of Pickups: " + numberOfPickups);
  }

}
