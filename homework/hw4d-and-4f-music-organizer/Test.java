import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
/**
 * This class is part of the homework problems 4d and 4f.
 * 
 * @author Shana
 */

public class Test
{
    private MusicOrganizer mo;
    private Random r;
    private ArrayList<Integer> shuf;
    
    public Test()
    {
        mo = new MusicOrganizer();
        shuf = new ArrayList<Integer>();
        r = new Random();
    }
    
    public void populate(int songNum)
    {
        for (int i = 1; i <= songNum; i++)
        {
            String songName = "song" + i + ".PCM";
            mo.addFile(songName);
        }
    }
    
    /**
     * For exercise 4d: "Create the Test class; from its test( ) method add 100 Tracks to the organizer. 
     * Display the tracks in the terminal window. "
     */
    
    public void problem4D()
    {
        populate(100);

        for (int i = 0; i < 100; i++)
        {
            System.out.println(mo.getTrack(i).getDetails());
        }
    }
    
    /**
     * For exercise 4f: "Play a random track."
     */
    
    public void problem4F43()
    {
        populate(10);
        int n = r.nextInt(10);
        System.out.println("playing track #" + n);
        mo.playTrack(n);
    }
    
    /**
     * For exercise 4f: "Play multiple tracks in a random order."
     */
    
    public void problem4F44(int numOfTracks)
    {
        populate(10);
        
        for (int i = 1; i <= numOfTracks; i++)
        {
            System.out.println("shuffle #" + i);
            int n = r.nextInt(9);
            System.out.println("playing track #" + n);
            mo.playTrack(n);
        }
    }
    
    /**
     * For exercise 4f: "Play every track in the list exactly once, in a random order."
     */
    
    public void problem4F45(int numOfTracks)
    {
        populate(numOfTracks);
        
        for (int i = 0; i < numOfTracks; i++)
        {
            shuf.add(i);
        }
        
        Collections.shuffle(shuf);
        
        for (int i = 0; i < numOfTracks; i++)
        {
            Integer num = shuf.get(i);
            System.out.println("playing track #" + num);
            mo.playTrack(num);
        }
    }
}
