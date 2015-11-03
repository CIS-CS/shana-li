/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Shana
 * @version The year 2014
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Sets the author, title, number of pages, and if it is a course text fields when this object is constructed.
     * 
     * @param String bookAuthor The author of the book.
     * @param String bookTitle The title of the book.
     * @param int bookPages The number of pages.
     * @param boolean isCourseText Whether or not the book is a course text.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = 0;
        courseText = isCourseText;
    }
    
    /**
     * Gets the name of the author of the book.
     * 
     * @return String The name of the author.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Gets the title of the book.
     * 
     * @return String the title of the book.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Gets the number of pages of the book.
     * 
     * @return int The number of pages of the book.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Determines whether or not the book is a course text.
     * 
     * @return boolean Whether or not the book is a course text.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Sets the reference number of the book to a string longer than 3 characters.
     * 
     * @param String The reference number.
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3)
        {
            System.out.println("Ref number too short!");
        }
        else
        {
            refNumber = ref;
        }
    }
        
    /**
     * Gets the reference number of the book.
     * 
     * @return String The book's reference number.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Increments the number of times the book has been borrowed by 1.
     */
    public void borrow()
    {
        borrowed += 1;
    }
    
    /**
     * Gets the number of times the book has been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
        
    /**
     * Prints the author's name, title, number of pages, reference number, and number of times it has been borrowed.
     */
    public void printDetails()
    {
        System.out.println ("Author:" + author +"," + "Title:" + title + "," + "Pages:" + pages + "," + "Reference #" + refNumber+ "," + "Borrowed " + borrowed + " times"); 
    }
}