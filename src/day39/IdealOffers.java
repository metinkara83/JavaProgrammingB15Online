package day39;

import java.util.ArrayList;

public class IdealOffers {

    public static void main(String[] args) {

        Offer n1 = new Offer();
        n1.isFullTime=true;
        n1.company="Equifax";
        n1.location="Alpharetta";
        n1.salary=95000;
        n1.displayOfferDetails();

        Offer n2 = new Offer();
        n2.isFullTime=false;
        n2.company="IHG";
        n2.location="Sandy Springs";
        n2.salary=115000;
        n2.displayOfferDetails();

        Offer n3 = new Offer();
        n3.isFullTime=true;
        n3.company="Bank of America";
        n3.location="Charlotte";
        n3.salary=100000;
        n3.displayOfferDetails();

        Offer n4 = new Offer();
        n4.isFullTime=false;
        n4.company="Walmart";
        n4.location="Charleston";
        n4.salary=90000;
        n4.displayOfferDetails();
        n4.turnToFullTime();
        n4.displayOfferDetails();
        n4.changeLocation("Washington");

        Offer n5 = new Offer();
        n5.isFullTime=true;
        n5.company="Visa";
        n5.location="Austin";
        n5.salary=120000;
        n5.displayOfferDetails();

        ArrayList<Offer> offerList = new ArrayList<>();
        offerList.add(n1);
        offerList.add(n2);
        offerList.add(n3);
        offerList.add(n4);
        offerList.add(n5);

        for (Offer eachOffer : offerList) {
            eachOffer.displayOfferDetails();
        }

        for (Offer eachOffer : offerList) {
            if (eachOffer.salary<100000){
                eachOffer.salary += 5000;
            }
            eachOffer.displayOfferDetails();
        }
    }
}
