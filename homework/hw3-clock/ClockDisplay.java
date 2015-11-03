
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * For exercise 3, the clock has been changed from 24-hours to 12-hours.
 * For exercise 3b, a new parameter for seconds has been added.
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String meridian;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        this(12, 0, 0, "AM");
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int second, String meridian)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        this.meridian = meridian;
        setTime(hour, minute, second, meridian);
    }
    
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        
        if(seconds.getValue() == 0)
        {
            minutes.increment();
            
            if (minutes.getValue() == 0)
            {  
                hours.increment();
                
                if (hours.getValue() == 0)
                {
                    hours.increment();
                }
            }
        }
        
        if (hours.getValue() == 12 && minutes.getValue() == 0 && seconds.getValue() == 0)
        {
            meridianSwitch();
        }
        
        updateDisplay();
    }
    
    private void meridianSwitch()
    {
        if (this.meridian == "AM")
        {
            this.meridian = "PM";
        }
        else
        {
            this.meridian = "AM";
        }
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute,  int second, String meridian)
    {
        if (hour <= 12 && minute <= 59 && second <= 59 && (meridian == "AM" || meridian == "PM"))
        {
            hours.setValue(hour);
            minutes.setValue(minute);
            seconds.setValue(second);
            this.meridian = meridian;
            updateDisplay();
        }
        else
        {
            System.out.println("Please enter a valid time.");
            hours.setValue(12);
            minutes.setValue(0);
            seconds.setValue(0);
            this.meridian = "AM";
        }
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue() + meridian;
        System.out.println(displayString);
    }
}