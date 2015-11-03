import java.util.ArrayList;
/**
 * Store details of club memberships.
 * For homework 4e.
 * 
 * @author Shana  
 */
public class Club
{
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(String name, int month, int year)
    {
        Membership member = new Membership(name, month, year);
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public void viewAllMembers()
    {
        System.out.println("All members:");
        
        for (int i = 0; i < members.size(); i++)
        {
            System.out.println(members.get(i).toString());
        }
    }
}
