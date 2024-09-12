public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 5);
        Book book2 = new Book("1984", "George Orwell", "987654321", 3);


        library.addBook(book1);
        library.addBook(book2);


        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");


        library.registerMember(member1);
        library.registerMember(member2);


        library.lendBook("123456789", "M001"); // Alice borrows The Great Gatsby
        library.lendBook("987654321", "M002"); // Bob borrows 1984
        library.lendBook("123456789", "M002"); // Bob tries to borrow The Great Gatsby
    }
}