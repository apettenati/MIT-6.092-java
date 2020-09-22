import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> libraryBooks;

    public Library(String address) {
        this.address = address;
        this.libraryBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        libraryBooks.add(book);
    }

    public static void printOpeningHours() {
        String openingHour = "9 am";
        String closingHour = "5 pm";
        System.out.println(openingHour + " to " + closingHour + ".");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookTitle) {
        boolean bookTitleSeen = false;
        for (Book book : libraryBooks) {
            String currentTitle = book.getTitle();
            if (bookTitle.equals(currentTitle)) {
                bookTitleSeen = true;
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You successfully borrowed " + bookTitle);
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
            }
        }

        if (!bookTitleSeen) {
            System.out.println("Sorry, this book is not in this our catalog");
        }
    }

    public void returnBook(String bookTitle) {
        boolean bookTitleSeen = false;
        for (Book book : libraryBooks) {
            String currentTitle = book.getTitle();
            if (bookTitle.equals(currentTitle)) {
                bookTitleSeen = true;
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You successfully returned " + bookTitle);
                } else {
                    System.out.println("Sorry, this book is already returned.");
                }
            }
        }

        if (!bookTitleSeen) {
            System.out.println("Sorry, this book is not in this our catalog");
        }
    }


    public void printAvailableBooks() {
        if (!libraryBooks.isEmpty()) {
            for (Book book : libraryBooks) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("No book in catalog");
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}