// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        library.addBook(new Book("1984", "George Orwell", "1234567891"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "1234567892"));

        // Add members
        library.addMember(new Member("Alice", "M001"));
        library.addMember(new Member("Bob", "M002"));

        // List available books
        System.out.println("Available books:");
        library.listAvailableBooks();

        // Check out a book
        library.checkOutBook("1234567890", "M001");

        // Try to check out the same book again
        library.checkOutBook("1234567890", "M002");

        // List available books after checkout
        System.out.println("\nAvailable books after checkout:");
        library.listAvailableBooks();

        // Return a book
        library.returnBook("1234567890");

        // List available books after return
        System.out.println("\nAvailable books after return:");
        library.listAvailableBooks();

        // List members
        System.out.println("\nLibrary members:");
        library.listMembers();
    }
}
