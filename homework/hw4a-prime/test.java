
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public int n;
    public boolean isPrime;
    
    public boolean isPrime(int n)
    {
        boolean result = true;
        
        if (n == 2)
        {
            return true;
        }
        else
        {
            for (int div = 3; div < n; div++)
            {
                if (n % div == 0)
                {
                    //System.out.println("This number is composite.");
                    result = false;
                }
            }
            return result;
        }
    }
    
    public void getList(int n)
    {
        System.out.println(2);
        for (int div = 2; div <= n; div++)
        {
            if (isPrime(div))
            {
                System.out.println(div);
            }
        }
    }
    
}
