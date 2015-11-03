
/**
 * This class is part of the homework problems 4a-4c.
 * 
 * @author Shana
 */
public class Test
{
    private MusicOrganizer mo;
    
    public Test()
    {
        mo = new MusicOrganizer();
    }    
    
    /**
     * for exercise 4. Adds 100 songs to the array list.
     */    
    public void addSongs(int songCount)
    {
        for(int i = 1; i <= songCount; i++)
        {
            String songName = "song" + i + ".PCM";
            mo.addFile(songName);
        }
    }

    public String probem4B(String search)
    {
        //addSongs(200);  //commented out to avoid repetition of search results; manually add songs instead.
        //mo.listAllFiles();
        String result = mo.search(search);
        
        System.out.println(result);
        return result;
    }
    
    public String probem4C(String search)
    {
        //addSongs(200);  //commented out to avoid repetition of search results; manually add songs instead.
        //mo.listAllFiles();
        String result = mo.search2(search);
        
        System.out.println(result);
        return result;
    }
}
