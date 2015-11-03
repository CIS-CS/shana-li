
/**
 *For exercise 3b: "Test should create a ClockDisplay object, set the time to 12:59:50, 
 *and then keep calling timeTick( ) in ClockDisplay with the output going to the Terminal window."
 */
public class Test
{
    private ClockDisplay clock;
    
    public Test()
    {
        clock = new ClockDisplay(12,59,50,"PM");
        loopTick();
    }
    
    private void loopTick()
    {
        while(true)
        {
            clock.timeTick();
            
            // pause .5 seconds
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                // ignore it
            }
        }
    }
}
