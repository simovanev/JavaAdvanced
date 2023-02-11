package IteratorsAndComparators.ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

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

    public Book(String title, int year, String...authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    @Override
    public int compareTo(Book o) {
        int titleCompare = this.title.compareTo(o.title);
        if (titleCompare!=0){
            return titleCompare;
        }
         return this.year-o.year;


    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}
