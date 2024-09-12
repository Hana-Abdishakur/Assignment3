import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList();
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void borrowBook(Book book) {
        if (book.getCopiesAvailable() > 0) {
            this.addBookToBorrowedList(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        } else {
            System.out.println("No copies available for " + book.title);
        }

    }

    private void addBookToBorrowedList(Book book) {
        this.borrowedBooks.add(book);
    }
}

