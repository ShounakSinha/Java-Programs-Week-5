abstract class LibraryItem
  {
    private String itemID;
    private boolean availability;
    abstract public void borrow();
    abstract public void return();
    LibraryItem()
    {
        availability=true;
    }
    public String getitemID()
    {
        return itemID;
    }
    public void setitemID(String itemID)
    {
        this.itemID=itemID;
    }
    public boolean getAvailability()
    {
        return availability;
    }
    public void setAvailability(boolean availability)
    {
        this.availability=availability;
    }
    
  }
class Book extends LibraryItem
  {
    private String title, author, ISBN;
    private int year;
    Book()
    {
      title="";
      author="";
      ISBN="";
      year=0;
    }
    Book(String title, String author, String ISBN, int year)
    {
      this.title=title;
      this.author=author;
      this.ISBN=ISBN;
      this.year=year;
    }
  }
class Magazine extends LibraryItem
  {
    private String title, publisher, ISBN;
    private int year;
    Magazine()
    {
      title="";
      author="";
      ISBN="";
      year=0;
    }
    Magazine(String title, String publisher, String ISBN, int year)
    {
      this.title=title;
      this.author=author;
      this.ISBN=ISBN;
      this.year=year;
    }
  }
