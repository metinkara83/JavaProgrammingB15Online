package day52.bookTask;

public interface KnowledgeBank {

    public abstract void takeNote();

    public default void showTableOfContents(){
        System.out.println("Showing table of contents for the book");
    }


}
