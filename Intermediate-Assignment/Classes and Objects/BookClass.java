//Create a class called "Book" with properties such as "title", "author", and "publisher". Implement the necessary getter and setter methods for each property.
class Book
{
    private String title;
    private String author;
    private String publisher;
    Book( String title,String author,String publisher)
    {
       this.title=title;
       this.author=author;
       this.publisher=publisher;
    }
    public void setTitle(String newtitle)
    {
       title=newtitle;
    }
    public void setAuthor(String newauthor)
    {
       author=newauthor;
    }
    public void setPublisher(String newpublisher)
    {
       publisher=newpublisher;
    }
    public String getAuthor()
    {
       return author;
    }
    public String getTitle()
    {
       return title;
    }
    public String getPublisher()
    {
       return publisher;
    }
    public String toString()
    {
        return getAuthor()+" "+getTitle()+" "+getPublisher();
    }
}
public class BookClass
{
    public static void main(String args[])
    {
        Book book=new Book("Red","XXX","ZXSE");
        System.out.println(book);
    }
}
    
    
