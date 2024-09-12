import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book> books;
    private List<Member> members;


    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void registerMember(Member member) {
        members.add(member);
    }


    public void lendBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Book or Member not found.");
        }
    }


    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (Objects.equals(book.getIsbn(), isbn)) {
                return book;
            }
        }
        return null;
    }


    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (Objects.equals(member.getMemberId(), memberId)) {
                return member;
            }
        }
        return null;
    }
}