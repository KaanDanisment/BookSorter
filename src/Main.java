import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Saphiens",410,"Yuval Noah Harrari",2012);
        Book b2 = new Book("Homo Deus",324,"Yuval Noah Harrari",2014);
        Book b3 = new Book("Nutuk",543,"Mustafa Kemal Atatürk",1927);
        Book b4 = new Book("Kuyucaklı Yusuf",220,"Sabahattin Ali",1937);
        Book b5 = new Book("Ateşten Gömlek",253,"Halide Edib Adıvar",2007);

        Set<Book> bookSet = new HashSet<>();

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);

        for (Book b: bookSet){
            System.out.println(b.getBookName()+ " " + b.getAuthorName() + " " + b.getPageCount());
        }
    }
}