public class Heater
{
    private int temperature;
    private int min;
    private int max;
    private int increment;
    
    public Heater()
    {
        temperature = 10;
        min = -50;
        max = 50;
        increment = 5;
    }
    
    public void setTemperature(int settemp)
    {
        temperature = settemp;
    }
    
    public int getTemperature()
    {
        return temperature;
    }
    
    public void setIncrement(int setinc)
    {
        if (setinc <= 0)
        {
            System.out.println("Please use a positive number.");
        }
        else
        {
            increment = setinc;
        }
    }
    
    public int getIncrement()
    {
        return increment;
    }
    
    public void cooler()
    {
        if (temperature - increment >= min)
        {
            temperature -= increment;
            System.out.println(getTemperature());
        }
        else
        {
            System.out.println("It's freezing please stop");
        }
    }
    
    public void warmer()
    {
        if (temperature + increment <= max)
        {
            temperature += increment;
            System.out.println(getTemperature());
        }
        else
        {
            System.out.println("It's like the equator please stop");
        }
    }
}
