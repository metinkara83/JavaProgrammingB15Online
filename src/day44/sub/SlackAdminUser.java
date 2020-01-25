package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    private int adminId;

    public SlackAdminUser(String name, String status, int adminId){
        this.name=name;
        this.status=status;
        this.adminId=adminId;
    }

    public void sendAtChannelMessage(){
        System.out.println("SlackAdmin "+name+" sending channel message");
    }

    public void deleteMessage(){
        System.out.println("SlackAdmin "+name+" deleting message");
    }

    public void addChannel(){
        System.out.println("SlackAdmin "+name+" adding channel");
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SlackAdminUser adm1 = new SlackAdminUser("Metin","coding",1759);
        // inherited methods we are calling
        adm1.sendMessage();
        adm1.callSomeone();
        adm1.addEmoji();
        // own methods in the class we are calling
        adm1.sendAtChannelMessage();
        adm1.deleteMessage();
        adm1.addChannel();
        System.out.println(adm1);


    }
}
