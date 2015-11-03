
/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen
{
    private int xRes;
    private int yRes;
    
    /**
     * Constructor for objects of class Screen
     */
    public Screen(int xRes, int yRes)
    {
        this.xRes = xRes;
        this.yRes = yRes;
    }
    
    public int getNumberOfPixels()
    {
        int numberOfPixels = xRes * yRes;
        return numberOfPixels;
    }
    
    public void clear(boolean invert)
    {
        if (invert)
        {
            System.out.println("Screen was cleared.");
        }
        else
        {
            System.out.println("Screen was not cleared.");
        }
    }
}
