package se.Lexicon;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private Book books;
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
