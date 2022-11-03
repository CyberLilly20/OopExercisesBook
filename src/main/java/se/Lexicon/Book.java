package se.Lexicon;

public class Book {

    public String title;
    public String author;
    public boolean available;

    public Person lender; Book[] bok;

    public Book() {
        this.available =true;
    }
    public Book(String title, String author){
        this();
        setTitle(title);
        setAuthor(author);
    }
    public void setLender(Person lender) {
        this.lender = lender;
        if (lender != null) setAvailable(false);
    }
    public Person getLender() {
        return lender;
    }

    public String getBookInformation(){
        return "Title:"+" "+ title + " Author: "+" "+ author +" Status: "+ available;
    }
    public String getLenderInformation(){
        if (lender != null){
            return "This book is already borrowed by: "+ lender.personInformation();
        }else{
            return "You can borrow this book.";
        }
    }

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
    public void setAvailable(boolean available){
        this.available= available;
    }


}