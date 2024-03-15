import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class user {
    // let us store user name and birthday so that we can find age of the user with birthday
    // other than name and birthday we can create anyting we want
    private String name;
    private LocalDate birthDay;
    private String university;
    private String country;

    //create a array list in which the borrowed books should be added in it
    //type of arraylist should be book
    public ArrayList<book> books = new ArrayList<book>();

    //create a constructor

    user(String name, String birthDay,String university,String country){
        this.name=name;
        this.birthDay=LocalDate.parse(birthDay);
        this.university=university;
        this.country=country;
    }

    // create age method and initialize age inside that method and find the age of the user using period class

    public int age(){
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();      // wrap using .getYears
        return age;
    }
    //create borrow method  and add the the borrowed books in array list books
    // borrow method is void because it does not return any value to the user

    public void borrow(book Book){
        this.books.add(Book);

    }
     // create getName and getBirthDay so that it can be initialize in user class itself not in main class
    // it makes name and birthDay private in this class

    public String getName(){
        return this.name;

    }
    public String getBirthDay(){
        return this.birthDay.toString();
    }
    // same for array list, university and country

    public String borrowedBooks(){
        return this.books.toString();
    }
    public String getUniversity(){
        return this.university;
    }
    public String getCountry(){
        return this.country;
    }
}
