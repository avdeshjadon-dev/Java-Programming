// ------------------- 5. Inner Class Accessing Outer Class Members -------------------
//
// Write a Java program to create an outer class called "Library" with an instance
// variable "libraryName". Create an inner class "Book" with a method "getLibraryName()"
// that returns the name of the library. Instantiate the Book class and call the
// "getLibraryName()" method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Library Name: Central Library


package JavaNestedClass;

class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public class Book {
        public String getLibraryName() {
            return libraryName;
        }
    }
}

public class JavaNestedClasses5 {
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Library.Book book = library.new Book();
        System.out.println("Library Name : " + book.getLibraryName());

    }
}
