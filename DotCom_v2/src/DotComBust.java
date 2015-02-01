import java.util.ArrayList;

public class DotComBust
{
  private GameHelper        helper       = new GameHelper();
  private ArrayList<DotCom> dotComList   = new ArrayList<DotCom>();
  private int               numOfGuesses = 0;

  private void setUpGame()
  {
    DotCom dotComOne = new DotCom();
    dotComOne.setName("Pets.com");

    DotCom dotComTwo = new DotCom();
    dotComTwo.setName("eToys.com");

    DotCom dotComThree = new DotCom();
    dotComThree.setName("Go2.com");

    dotComList.add(dotComOne);
    dotComList.add(dotComTwo);
    dotComList.add(dotComThree);

    System.out.println("You goal is to sink " + dotComList.size() + " dotcoms:");
    for (DotCom dc : dotComList)
    {
      System.out.println(" > " + dc.getName());
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dc.setLocationCells(newLocation);
    }
    System.out.println("Try to sink them in the fewest number of moves.");
  }

  private void startPlaying()
  {
    while (!dotComList.isEmpty())
    {
      String userGuess = helper.getUserInput("Enter a guess ");
      checkUserGuess(userGuess);
    }

    finishGame();
  }

  private void checkUserGuess(String userGuess)
  {
    numOfGuesses++;
    String result = "miss";
    for (DotCom dc : dotComList)
    {
      result = dc.checkYourself(userGuess);
      if (result.equals("hit"))
      {
        break;
      }

      if (result.equals("kill"))
      {
        dotComList.remove(dc);
        break;
      }

    }
    System.out.println(result);

  }

  private void finishGame()
  {
    System.out.println("All Dot Coms are Dead!");
  }

  public static void main(String[] args)
  {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }
}
