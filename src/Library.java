// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void checkOutBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        if (book != null && !book.isCheckedOut()) {
            book.checkOut();
            System.out.println("Book checked out: " + book);
        } else {
            System.out.println("Book not available for checkout.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null && book.isCheckedOut()) {
            book.returnBook();
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Book not found or wasn't checked out.");
        }
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
