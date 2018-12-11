import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Abruf {
    public static void main(String[]args){
        Date datum=new Date(118, 10, 2, 14, 9, 54);
        Book num1=new Book(200,datum,"My Book","125215-12521-73473");
        System.out.println("Das Buch hat "+ num1.getPages()+" Seiten, wurde am "+ num1.getReleased()+ " veröffentlicht und hat den Titel "+ num1.getTitle());

        List<Book>Liebling=new ArrayList<>();
        Liebling.add(new Book(200, datum, "My Book 1", "125215-12521-73473"));
        Liebling.add(new Book(200, datum, "My Book 2", "6437-623623-24254"));
        Liebling.add(new Book(200, datum, "My Book 3", "26326-734737-732473"));
        Liebling.add(new Book(200, datum, "My Book 4", "745854-124412-348743848"));
        Liebling.add(new Book(200, datum, "My Book 5", "672-5236236-123483475125"));

        for(Book x : Liebling){
            System.out.println(x.getTitle()+ " hat "+ x.getPages()+ " Seiten und folgende ISBN: "+x.getIsbn());
        }
        List<Paperbook> paperbooks = new ArrayList<>();

        paperbooks.add(new Paperbook(200, datum, "My Paperbook 1", "0000-00000-0000", "nothing", "April"));
        paperbooks.add(new Paperbook(210, datum, "My Paperbook 2", "0000-00000-0000", "nothing", "April"));
        paperbooks.add(new Paperbook(240, datum, "My Paperbook 3", "0000-00000-0000", "nothing", "January"));
        paperbooks.add(new Paperbook(100, datum, "My Paperbook 4", "0000-00000-0000", "nothing", "March"));
        paperbooks.add(new Paperbook(140, datum, "My Paperbook 5", "0000-00000-0000", "nothing", "October"));

        for (Paperbook x : paperbooks){
            System.out.println(x.getTitle()+ " hat "+ x.getPages()+" Seiten und folgende ISBN: "+ x.getIsbn()+ " zusätzlich ist es im Monat "+x.getMonth()+" erschienen");
        }
    }
}
