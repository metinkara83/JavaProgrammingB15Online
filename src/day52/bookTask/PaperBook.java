package day52.bookTask;

public class PaperBook extends Book implements Readable{

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of the paper book is "+name+" and the author is "+author+" with a weight of "+weight+ " pounds");
    }

    @Override
    public void read(){
        System.out.println("Reading "+name);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes from the paper book "+name);
    }
}
