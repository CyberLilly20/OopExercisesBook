package se.Lexicon;

import java.util.Arrays;

public class Person {
    // fields
    private int id;
    private String firstName;
    private String lastName;

    private Book[] loanBooks= new Book[0];

    // constructors
    public Person(){

    }

    // methods
    public void loanBook(Book borrowedBook){
        // check if borrowedBook is available
        if(borrowedBook.isAvailable()){
            borrowedBook.setLender(this);
        Book[] bok = Arrays.copyOf(loanBooks, loanBooks.length+ 1);
        bok[bok.length -1] = borrowedBook;
        loanBooks = bok;
        } else {
            System.out.println("Title:" + borrowedBook.getTitle()+ "is not available");
            // create a make a copy of existing array with one extra element
            // add borrowedBook to the last index of created new array
            // replace the created array with loanBooks
        }


    }

    public String displayBooks(){
        System.out.println(Arrays.toString(loanBooks));
        // display all information for loanBooks
        return " ";
    }

    // getters & setters
    public void setFirstName(String firstName) {
        if(firstName == null) throw new IllegalArgumentException ("FirstName parameter is noll");
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        if(lastName == null) throw new IllegalArgumentException("LastName parameter is null");
        this.lastName = lastName;
    }
    public String getLastName(){
      return lastName;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String personInformation(){
        return "Person: FirstName:" + firstName +"  " + "LastName:" + lastName +"  " + "ID number:" + id;
    }


}



