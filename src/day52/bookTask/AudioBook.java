package day52.bookTask;

public class AudioBook extends Book{

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of the audio book is "+name+" and the author is "+author+" with a duration of "+duration+" mins.");
    }

    public void listen(){
        System.out.println("Listening "+name);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes from the audio book "+name);
    }

    @Override
    public void showTableOfContents(){
        System.out.println("Taking notes on the digital book by "+name+" writing the provided digital table");

    }
}
