public class Heater
{
    private int temperature;
    private int min = 0;
    private int max = 30;
    private int increment;
    
    
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
        increment = setinc;
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
