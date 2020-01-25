package day39;

public class Offer {

//    Create Offer class with
//    instance fields :
//    location, company, salary , isFullTime
//    instance methods :
//    displayOfferDetails -- print all info about offers
//    Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
//    Optionally : @channel
//    Store them into List<Offer> then call the method.
//    Optionally :
//    Add 5000 to each offers less than 100K

    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void displayOfferDetails (){
        System.out.println("location = " + location +" | company = "+company+" | salary = "+salary+" | isFullTime = "+isFullTime);
    }

    // Write a method called turnToFullTIme

    public void turnToFullTime() {
        if (isFullTime!=true) {
            isFullTime = true;
        }
    }

    // Write a method to change the location of the Offer to the location user passed
    public void changeLocation(String newLocation){
        location = newLocation;
    }
}
