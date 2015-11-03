/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    
    /**
     * Exercise 4d: Edit the Track class to include the length of the song, and the year the song was written. 
     * This will have a knock-on affect to other methods/constructors in the class. Adjust all appropriate 
     * class members.
     */
    
    private String songlength;
    // How long the track is.
    private String year;
    // What year the track was produced in.
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        this("unkown", "unknown", filename, "unknown", "unknown");
    }
    
        /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, String songlength, String year)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.songlength = songlength;
        this.year = year;
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
    
    public String getSongLength()
    {
        return songlength;
    }
    
    public String getSongYear()
    {
        return year;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")" + " length: " + songlength + " composed in " + year;
    }
}
