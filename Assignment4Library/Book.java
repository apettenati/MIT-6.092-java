public class Book {
    private final String title;
    private boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
    }
   
    // Marks the book as rented
    public void borrowBook() {
        this.borrowed = true;
    }
   
    // Marks the book as not rented
    public void returnBook() {
        this.borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title : " + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.borrowBook();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returnBook();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }
}