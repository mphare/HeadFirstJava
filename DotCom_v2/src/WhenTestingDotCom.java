import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhenTestingDotCom
{

  @Test
  public void ShouldHit()
  {
    DotCom dot = new DotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "2";

    String result = dot.checkYourself(userGuess);

    assertEquals("hit", result);

  }

  @Test
  public void ShouldMiss()
  {
    DotCom dot = new DotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "5";

    String result = dot.checkYourself(userGuess);

    assertEquals("miss", result);

  }

  @Test
  public void ShouldKill()
  {
    DotCom dot = new DotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "2";
    dot.checkYourself(userGuess);

    userGuess = "3";
    dot.checkYourself(userGuess);

    userGuess = "1";
    dot.checkYourself(userGuess);

    userGuess = "4";
    String result = dot.checkYourself(userGuess);

    assertEquals("kill", result);

  }

  @Test
  public void ShouldNotKill()
  {
    DotCom dot = new DotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "2";
    dot.checkYourself(userGuess);

    userGuess = "3";
    dot.checkYourself(userGuess);

    userGuess = "1";
    dot.checkYourself(userGuess);

    userGuess = "5";
    String result = dot.checkYourself(userGuess);

    assertEquals("miss", result);

  }

}
