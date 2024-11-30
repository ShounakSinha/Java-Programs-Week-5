abstract class LibraryItem
  {
    protected String itemID;
    protected int availability;
    abstract public void borrow();
    abstract public void return();
  }
class Book extends LibraryItem
  {
  }
class Magazine extends LibraryItem
  {
  }

