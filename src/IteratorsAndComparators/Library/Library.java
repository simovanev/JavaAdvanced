package IteratorsAndComparators.Library;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;
    public  Library(Book...books){
        this.books=books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book> {
        private int counter = 0;

        public boolean hasNext() {
            if (this.counter < books.length) {
                return false;
            }
            return true;
        }
        public Book next(){
            return books[counter++];
        }



    }
}
