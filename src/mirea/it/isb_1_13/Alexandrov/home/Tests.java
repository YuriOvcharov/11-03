package mirea.it.isb_1_13.Alexandrov.home;

/**
 * Created by Степан on 11.03.2015.
 */
public class Tests {
    public static void main(String[] args) {
        //проверка автора
        Author author = new Author("Vasiliy", "vasya@gmail.com", 'M');  // создаем нового автора,проверка конструктора
        System.out.println(author);                                     // тестовый вывод, проверка работы toString
        author.setEmail("newVasiliy@gmail.com");                        // проверка set- getEmail
        System.out.println(author.getEmail());                          //
        System.out.println(author.getName());                           // проверка getName
        System.out.println(author.getGender());                         //проверка getGender

        // проверка книги

        Book book1 = new Book("book1", author, 100.12, 10);             // проверка конструкторов
        Book book2 = new Book("book2", author, 100.12);
        System.out.println(book1);                                      //проверка toString
        System.out.println(book2);
        book1.setPrice(123.21);                                         //проверка setter'ов
        book1.setQtyInStock(32);
        System.out.println( book1.getPrice());                          // проверка getter'ов
        System.out.println( book1.getAuthor());
        System.out.println( book1.getName());
        System.out.println( book1.getQtyInStock());
    }


}
