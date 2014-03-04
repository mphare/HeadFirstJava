public class MyRunnable implements Runnable
{
  public void run()
  {
    go();
  }

  public void go()
  {
    doMore();
  }

  public void doMore()
  {
    System.out.println("top of the stack");
    try
    {
      Thread.sleep(3000);

    } catch (Exception ex)
    {
      ex.printStackTrace();
    }
    System.out.println("Thread Ending");
  }
}
