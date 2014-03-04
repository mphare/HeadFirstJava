public class ThreadTestDrive
{

  public static void main(String[] args)
  {
    Runnable threadJob = new MyRunnable();
    Thread myThread = new Thread(threadJob);

    myThread.setName("MyThread");

    myThread.start();

    System.out.println("Thread Started");
    try
    {
      Thread.sleep(2000);
    } catch (Exception ex)
    {
      ex.printStackTrace();
    }
    System.out.println("back in main");

  }
}
