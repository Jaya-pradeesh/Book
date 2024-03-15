import java.awt.print.Book;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your Name, birthDay - YYYY-MM-DD, Uiversity, Country: \n");
        user User = new user("Jayapradeesh","2001-10-22","Sathyabama University","India");
//        System.out.print("Enter Book title and author: ");
        book Book = new book("Wings of Fire","Dr. APJ AbdulKalam");
        User.borrow(Book);

        System.out.printf("%s age %s from %s currently pursing bachelors degree in %s have borrowed %s",User.getName(),User.age(),User.getCountry(),User.getUniversity(),User.borrowedBooks());





    }
}