package test;

public class Guitar
{

  protected String type;
  protected String brand;
  protected String model;
  protected int    numberOfStrings;

  public Guitar()
  {
    super();
  }

  public String getBrand()
  {
    return brand;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public int getNumberOfStrings()
  {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings)
  {
    this.numberOfStrings = numberOfStrings;
  }

  public void showValues()
  {
    System.out.println("My Guitar:");
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Type: " + type);
    System.out.println("Number of Strings: " + numberOfStrings);

  }

}