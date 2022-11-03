package se.Lexicon;

import javax.xml.bind.SchemaOutputResolver;

public class App {
    public static void main(String[] args) {


        Person liljana = new Person();
        liljana.setFirstName("Liljana");
        liljana.setLastName("Ristevska");
        liljana.setId(12345);
        System.out.println(liljana.personInformation());

        Person koki = new Person();
        koki.setFirstName("Koki");
        koki.setLastName("Ristevski");
        koki.setId(678910);


       System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        Book code = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(code.getBookInformation());


        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        code.setLender(liljana);
        System.out.println(code.getBookInformation());
        System.out.println(code.getLenderInformation());



        Book go = new Book("Don't Let Go", "Harlan Coben");
        go.setLender(koki);
        System.out.println(go.getBookInformation());
        System.out.println(go.getLenderInformation());
        koki.loanBook(go);


        Book madame = new Book("Madame Bovary", "Gustave Flaubert");
        madame.setLender(liljana);
        System.out.println(madame.getBookInformation());
        System.out.println(madame.getLenderInformation());
        liljana.loanBook(madame);

        Book love = new Book("Eat, Pray, Love","Elizabeth Gilbert");
        //love.setLender();
        System.out.println(love.getBookInformation());
        System.out.println(love.getLenderInformation());



    }

}
