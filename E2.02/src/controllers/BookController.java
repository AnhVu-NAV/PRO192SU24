
package controllers;
import entities.Book;
import models.BookModel;


/**
 *
 * @author Home
 */
public class BookController {
    private BookModel bookModel;

    public BookController() {
        this.bookModel = new BookModel();
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public void create(Book creatingBook) {
        if (bookModel.create(creatingBook)) {
            System.out.println("Create success!");
        } else {
            System.out.println("Create failed!");
        }
    }

    public void update(Book updatingBook) {
        if (bookModel.update(updatingBook)) {
            System.out.println("Update success!");
        } else {
            System.out.println("Update failed!");
        }
    }

    public void read(Book readingBook) {
        Book foundBook = bookModel.read(readingBook);
        if (foundBook != null) {
            System.out.println(foundBook);
        } else {
            System.out.println("Read failed!");
        }
    }

    public void delete(Book deletingBook) {
        if (bookModel.delete(deletingBook)) {
            System.out.println("Delete success!");
        } else {
            System.out.println("Delete failed!");
        }
    }
    public void showAll(){
        bookModel.showAll();
    }
}
