package test;

public class RunMe
{
  int whichOne = 0;

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    System.out.println("This is a Test program");

    int x = 1;
    while (x < 10)
    {
      System.out.println("Value of x: " + x);
      if (x >= 4)
      {
        System.out.println("In the conditional, x = " + x);
      } else
      {
        System.out.println("Else of conditional, x = " + x);
      }
      x = x + 1;
    }

    x = 3;
    while (x > 0)
    {
      if (x > 2)
      {
        System.out.print("a");
      }
      x = x - 1;
      System.out.print("-");

      if (x == 2)
      {
        System.out.print("b c");
      }

      if (x == 1)
      {
        System.out.print("d");
        x = x - 1;
      }
    }

    System.out.println();

    // ==========================================
    // Chapter 3
    int[] arrayInt; // Simple declares arrayInt will be an array of 'int'. No
                    // array is created, just this reference.
    arrayInt = new int[7]; // Now the array is created and assigned to the
                           // previously defined array reference.

    arrayInt[0] = 1;
    arrayInt[1] = 2;

    // ==========================================
    // Chapter 2

    // Instantiate an object of type RunMe.
    RunMe run1 = new RunMe(arrayInt[0]);
    run1.methodOne();
    System.out.println("But, which one did I just create? Ah, number " + run1.whichOne());

    // ==========================================
    // Chapter 4
    Guitar myGuitar1 = new ElectricGuitar();
    myGuitar1.setBrand("Gibson");
    myGuitar1.setModel("Les Paul");
    ((ElectricGuitar) myGuitar1).setNumberOfPickups(2);
    myGuitar1.setNumberOfStrings(6);

    Guitar myGuitar2 = new ElectricGuitar("Fender", "Stratocaster", 3, 6);

    Guitar myGuitar3 = new AcousticGuitar();
    myGuitar3.setBrand("Yamaha");
    myGuitar3.setModel("F200");
    myGuitar3.setNumberOfStrings(6);

    Guitar[] eg;
    eg = new Guitar[5];
    eg[0] = myGuitar1;
    eg[1] = myGuitar2;
    eg[2] = new ElectricGuitar("Gibson", "SG", 2, 6);
    eg[3] = myGuitar3;

    eg[0].showValues();
    eg[1].showValues();
    eg[2].showValues();
    eg[3].showValues();

  }

  public RunMe(int whichOne)
  {
    this.whichOne = whichOne;
  }

  void methodOne()
  {
    System.out.println("In methodOne():" + whichOne);
  }

  int whichOne()
  {
    return this.whichOne;
  }

}
