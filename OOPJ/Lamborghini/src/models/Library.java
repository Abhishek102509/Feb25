package models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<String, Book> books; // ISBN to Book mapping
    private Set<Member> members;

    public Library() {
        this.books = new HashMap<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
    }

    // Display all books using Iterator
    public void displayBooks() {
        Iterator<Book> iterator = books.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Search for a book by ISBN
    public Book searchBook(String ISBN) {
        return books.get(ISBN);
    }

    // Get total number of members
    public int getTotalMembers() {
        return members.size();
    }

    // Get total number of books
    public int getTotalBooks() {
        return books.size();
    }

	public Member findMember(int displayMemberID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Member[] getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

//	public Member findMember(int displayMemberID) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}