package IteratorsAndComparators.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    private  String title;
    private  int year;
    private List<String> authors;

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String...author) {
        if (author.length==0){
            this.authors= new ArrayList<>();
        }else {
            this.authors=new ArrayList<>(Arrays.asList(author));
        }
    }

    public Book( String title, int year, String...authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }
}
