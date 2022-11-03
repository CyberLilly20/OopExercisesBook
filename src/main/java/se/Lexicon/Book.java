package se.Lexicon;

public class Book {

    public String title;
    public String author;
    public boolean available;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author) {
        this.author =author;
    }
    public String getAuthor(){
        return author;
    }

    public boolean isAvailable() {
        return available;
    }
}