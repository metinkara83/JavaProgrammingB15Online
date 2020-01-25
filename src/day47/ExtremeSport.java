package day47;

public class ExtremeSport extends Sport{

//    @Override
//    public void doSomething() {
////        super.doSomething();
//        System.out.println("doing extreme sport");
//    }

    // cannot override
    // but you can do anything else
    // for example you can overload it
    public void doSomething(int x){
        System.out.println("doing extreme sport with "+x+" actions");
    }
    @Override
    public final void doSomethingElse() {
        System.out.println("doing something else in extreme sport");
    }
}
