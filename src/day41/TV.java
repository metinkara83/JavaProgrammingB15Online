package day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;

    public int getCurrentChannel(){
        return currentChannel;
    }
    // we cannot set a channel if the Tv is off!!!!
    // valid channel 0-50
    public void setCurrentChannel(int newChannel){
        // if my channel is out of range I want to exit from the method
        if(newChannel<0 || newChannel>50){
            System.out.println("Invalid Channel, getting out");
            return; // early exit from the method
        }

        if (isOn==true){
            currentChannel = newChannel;
        }
        else {
            System.out.println("Turn on the TV first");
        }
    }

    public void turnOn(){
        if (isOn==false){
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff(){
        if (isOn==true){
            System.out.println("Turning off TV");
            isOn=false;
        }
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
