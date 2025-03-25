package services;

import exceptions.*;
import models.Book;
import models.Library;
import models.Member;

public class LibraryService {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    // Borrow a book
    public void borrowBook(int memberID, String ISBN) throws BookNotAvailableException, MemberNotFoundException, BookAlreadyBorrowedException {
        Book book = library.searchBook(ISBN);
        if (book == null) {
            throw new BookNotAvailableException("Book is not available.");
        }

        Member member = findMember(memberID);
        if (member == null) {
            throw new MemberNotFoundException("Member not found.");
        }

        if (member.getBorrowedBooks().contains(book)) {
            throw new BookAlreadyBorrowedException("You have already borrowed this book.");
        }

        member.borrowBook(book);
        book.setAvailable(false);
    }

    // Return a book
    public void returnBook(int memberID, String ISBN) throws MemberNotFoundException {
        Book book = library.searchBook(ISBN);
        Member member = findMember(memberID);

        if (member == null) {
            throw new MemberNotFoundException("Member not found.");
        }

        member.returnBook(book);
        book.setAvailable(true);
    }

    // Find a member by ID
    private Member findMember(int memberID) {
        for (Member member : library.getMembers()) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null;
    }

    // Print library statistics
    public void printStatistics() {
        System.out.println("Total Members: " + library.getTotalMembers());
        System.out.println("Total Books: " + library.getTotalBooks());
        System.out.println("Currently Borrowed Books: " + (library.getTotalBooks() - library.getAvailableBooksCount()));
    }
}