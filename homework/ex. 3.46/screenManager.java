
/**
 * Write a description of class screenManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class screenManager
{
    private Screen s = null;
    
    public screenManager()
    {
        s = new Screen(800,600);
    }
    
    public void test()
    {
        int pixels = s.getNumberOfPixels();
        
        if (pixels > 2000)
        {
            s.clear(true);
        }
        else 
        {
            s.clear(false);
        }
       
    }    
}
