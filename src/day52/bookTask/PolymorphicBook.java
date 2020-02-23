package day52.bookTask;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBook {

    public static void main(String[] args) {

        // We can refer the paper book object using
        // --- its own type : Paperbook
        // --- or ot's super type: Book, Readable, KnowledgeBank, Object

        // reference type is Book, actual object type is PaperBook
        Book b1 = new PaperBook("Java","Akbar",3);
        System.out.println("b1 Object Type : "+b1.getClass().getSimpleName());
        b1.displayBookInfo();
        // This is the very similar idea as putting the small coffee cup into bigger cup
        KnowledgeBank kb = b1;
        kb.takeNote();
        kb.showTableOfContents();

        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        b3.showTableOfContents();
        b3.displayBookInfo();
        System.out.println("b3 = " + b3);
//        ((AudioBook) b3).listen();   //???????
        
        Book b4 = new AudioBook("The Kite of Runner","Khaled Hossaini",3);
        Book b5 = new PaperBook("Lord of the Rings","J.R.R.Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R.R. Martin",11.5);

        List<Book> bookList = Arrays.asList(b1,b2,b3,b4,b5,b6);

        // counting how many paper book we have
        int paperBookCount = 0;
        for (Book eachBook : bookList) {
//            eachBook.displayBookInfo();
            String className = eachBook.getClass().getSimpleName();
            if(className.equals("PaperBook")){
                paperBookCount++;
            }
        }
        System.out.println("Paper Book Count = "+paperBookCount);

        // we want to get tge class type name using the object
        // obj.getClass().getSimpleName()

    }
}
