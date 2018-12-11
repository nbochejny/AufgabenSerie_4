import java.util.Date;

public class Abruf {
    public static void main(String[]args){
        Date datum=new Date(118, 10, 2, 14, 9, 54);
        Book num1=new Book(200,datum,"My Book","125215-12521-73473");
        System.out.println("Das Buch hat "+ num1.getPages()+" Seiten, wurde am "+ num1.getReleased()+ " veröffentlicht und hat den Titel "+ num1.getTitle());
    }
}
