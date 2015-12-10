package NewtonCalc;

// For writing to the file
import java.io.FileWriter;
import java.io.PrintWriter;

// For reading from the file
import java.io.FileReader;
import java.io.BufferedReader;

// Other I/O stuff
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * Persister manages the I/O between the application and the text file.
 * @author MHayes
 * @author modified a lot by Shana
 */
public class Persister {
    
    private final String   filename = "data_do_not_modify.txt";    // searches in the root of the file.  
    private FileWriter     fw = null;                // For writing to the file.
    private PrintWriter    pw = null;
    private FileReader     fr = null;                // For reading from the file.
    private BufferedReader br = null;    
    
    public PrintWriter getPW() {
        return pw;
    }
    
    public void clear() throws IOException {
        fw = new FileWriter(filename);
        pw = new PrintWriter(fw);
        pw.write("");
        pw.flush();
        pw.close();
        
        fw = null;
        pw = null;
    }
    
    public void write(Universe u) throws IOException
    {
        fw = new FileWriter(filename, true);  
        pw = new PrintWriter(fw);  
            
        String print = u.getBall().getInitVel() + ";" + u.getPlanet().getMassBase()
            + ";" + u.getPlanet().getMassPow() + ";" + u.getPlanet().getG()
            + ";" + u.getPlanet().getRadius() + ";" + u.getPlanet().getOrbitVel()
            + ";" + u.getPlanet().getEscVel() + ";" + u.getPlanet().getGForce()
            + ";" + u.getBall().getPathType();
                
        pw.println(print);
        pw.close();
    }
    
    public ArrayList<Universe> read() throws IOException
    {
        ArrayList<Universe> u = new ArrayList<>();
        String record = null;
        
        double initVel = 0;
        double massBase = 0;
        int massPow = 0;
        double g = 0;
        double radius = 0;
        double orbitVel = 0;
        double escVel = 0;
        double gForce = 0;
        String pathType = null;
        
        try
        {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            
            record = null;
            record = br.readLine();
            
            while (record != null)
            {
                String[] info = record.split(";");
                
                initVel = Double.parseDouble(info[0]);
                massBase = Double.parseDouble(info[1]);
                massPow = Integer.parseInt(info[2]);
                g = Double.parseDouble(info[3]);
                radius = Double.parseDouble(info[4]);
                orbitVel = Double.parseDouble(info[5]);
                escVel = Double.parseDouble(info[5]);
                gForce = Double.parseDouble(info[6]);
                pathType = info[7];
                
                Universe uni = new Universe(initVel, massBase, massPow, g, radius, 
                    orbitVel, escVel, gForce, pathType);
                
                u.add(uni);
                record = br.readLine();
            }
            
            return u;
        }
        catch(IOException e)
        {
            throw new IOException("Error reading file: " + e);
        }
        catch(NoSuchElementException e)
        {
            throw new NoSuchElementException("Error reading file: " + e);
        }
        catch(NumberFormatException e)
        {
            throw new NumberFormatException("Error reading file: " + e);
        } 
    }
}








