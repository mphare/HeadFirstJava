public class RunDotCom
{

  public static void main(String[] args)
  {
    int numOfHits = 0;
    int numOfGuesses = 0;
    String resultString = "Game Running";
    GameHelper gameHelper = new GameHelper();

    DotCom dot = new DotCom();
    int startLocation = (int) (Math.random() * 5);

    int[] locationCells = { startLocation, startLocation + 1, startLocation + 2 };

    dot.setLocationCells(locationCells);

    while (numOfHits < locationCells.length)
    {
      String userInput;

      // Get user input into userInput
      userInput = gameHelper.getUserInput("Enter your guess");
      String result = dot.checkYourself(userInput);
      numOfGuesses++;

      if (result.equals("kill"))
      {
        resultString = "Killed Dot Com";
        break;
      }

      if (numOfGuesses > 5)
      {
        resultString = "Too Many Gusses";
        break;
      }
    }
    System.out.println("Game is Over: " + resultString);

  }
}
