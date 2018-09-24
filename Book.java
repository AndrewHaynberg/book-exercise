/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Andrew Haynberg)
 * @version (9/17/18)
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
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages,boolean coursetext)
    {
        courseText= coursetext;
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed= 0;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    public String getAuthor()
    {
     return author;
    
    }
    public String getTitle()
    {
     return title;
    
    }
    public int getPages()
    {
     return pages;
    
    }
    public String getRefNumber()
    {
     return refNumber;
    
    }
    public int getBorrowed()
    {
     return borrowed;
    
    }
    public void setRefNumber(String ref)
    {
        if(ref.length()>=3) 
        {
            refNumber=ref;
        }
        else
        {
            System.out.print("ERROR: refNumber must be at less three characters");
        }
        
    }
    public void borrowed()
    {
        borrowed++;
    }
    public void printAuthor()
    {
     System.out.print(author);
    
    }
    public void printTitle()
    {
     System.out.print(title);
    
    }
    public void printPages()
    {
     System.out.print(pages);
    
    }
    public void printRefNumber()
    {
     System.out.print(refNumber);
    
    }
    public void printBorrowed()
    {
     System.out.print(borrowed);
    
    }
    public void printDetails()
    {
        if(refNumber.length()>0)
        {
            System.out.println("Title : "+title+ "  Author : "+author+"  Pages : "+pages+"  ref# : "+refNumber);
            System.out.println("This book has been borrowed "+borrowed+"times");
        }    
        else
        {
            System.out.println("Title : "+title+ "  Author : "+author+"  Pages : "+pages+"  ref# : "+"ZZZ");
            System.out.println("This book has been borrowed "+borrowed+"times");
        }
    
    }
}

