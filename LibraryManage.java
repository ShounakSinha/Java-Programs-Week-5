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
  }
class Magazine extends LibraryItem
  {
  }
