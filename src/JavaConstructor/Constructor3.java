// ------------------- 3. Constructor Overloading -------------------
//
// Write a Java program to create a class called "Book" with instance variables
// title, author, and price. Implement:
//   - A default constructor
//   - A parameterized constructor taking title and author
//   - A parameterized constructor taking title, author, and price
// Print the values of the variables for each constructor.
//
// ------------------- SAMPLE OUTPUT -------------------
// Default Constructor:
// Title: Unknown
// Author: Unknown
// Price: 0.0
//
// Parameterized Constructor (title, author):
// Title: Java Programming
// Author: John Doe
// Price: 0.0
//
// Parameterized Constructor (title, author, price):
// Title: Java Programming
// Author: John Doe
// Price: 500.0


package JavaConstructor;

class Book {
    String title;
    String author;
    double price;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Constructor3 {


    public static void main(String[] args) {
        //for default constructor
        Book myBook = new Book();
        System.out.println(myBook.title);
        System.out.println(myBook.author);
        System.out.println(myBook.price);
        // for second constructor

        Book myBook1 = new Book("Lady Gaga", "Munsi Premchand");
        System.out.println(myBook1.title);
        System.out.println(myBook1.author);
        System.out.println(myBook1.price);

        //for third constructor
        Book myBook2 = new Book("Janeman", "Avdesh", 10000);
        System.out.println(myBook2.title);
        System.out.println(myBook2.author);
        System.out.println(myBook2.price);
    }
}
