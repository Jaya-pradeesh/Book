import java.util.*;

public class book {

    // we need to store title of the book and author of the book
    public String title;
    public String author;

    //override toString() method to print output without any error

    public String toString(){
        return String.format("'%s' by %s",title,author);
    }
    book(String title,String author){
        this.title=title;
        this.author=author;
    }
}