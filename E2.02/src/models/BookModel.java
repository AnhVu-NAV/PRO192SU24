/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import entities.Book;


public class BookModel {
    private ArrayList<Book> bookList;

    public BookModel() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public boolean create(Book creatingBook) {
        if (search(creatingBook)) {
            return false;
        } else {
            bookList.add(creatingBook);
            return true;
        }
    }

    public boolean update(Book updatingBook) {
        Book existBook = read(updatingBook);
        if (existBook != null) {
            existBook.setName(updatingBook.getName());
            existBook.setAuthor(updatingBook.getAuthor());
            existBook.setPublicationDate(updatingBook.getPublicationDate());
            existBook.setPrice(updatingBook.getPrice());
            existBook.setDiscount(updatingBook.getDiscount());
            existBook.setQuantity(updatingBook.getQuantity());
            return true;
        }
        return false;
    }

    public Book read(Book readingBook) {
        for (Book book : bookList) {
            if (book.getId().equals(readingBook.getId())) {
                return book;
            }
        }
        return null;
    }

    public boolean delete(Book deletingBook) {
        Book existBook = read(deletingBook);
        if (existBook != null) {
            bookList.remove(existBook);
            return true;
        }
        return false;
    }

    private boolean search(Book creatingBook) {
        for (Book book : bookList) {
            if (creatingBook.getId().equals(book.getId())) {
                return true;
            }
        }
        return false;
    }
    public void showAll(){
        for(Book book : bookList){
            System.out.println(book.toString());
        }
    }
}
