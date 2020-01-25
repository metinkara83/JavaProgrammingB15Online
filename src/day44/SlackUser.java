package day44;

public class SlackUser {

    protected String name;
    protected String status;

    public SlackUser(){

    }

    public void sendMessage(){
        System.out.println("SlackUser "+name+" sending message");
    }

    public void callSomeone(){
        System.out.println("SlackUser "+name+" calling");
    }

    public void addEmoji(){
        System.out.println("SlackUser "+name+" adding emoji :)");
    }

}
