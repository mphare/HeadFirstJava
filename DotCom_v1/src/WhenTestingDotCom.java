import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhenTestingDotCom
{

  @Test
  public void ShouldHit()
  {
    SimpleDotCom dot = new SimpleDotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "2";

    String result = dot.checkYourself(userGuess);

    assertEquals(result, "hit");

  }

  @Test
  public void ShouldMiss()
  {
    SimpleDotCom dot = new SimpleDotCom();

    int[] locations = { 2, 3, 4 };

    dot.setLocationCells(locations);

    String userGuess = "5";

    String result = dot.checkYourself(userGuess);

    assertEquals(result, "miss");

  }

}
