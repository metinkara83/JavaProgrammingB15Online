package day51;

public abstract class Animal {
    public abstract void makeNoise();
//        System.out.println("general animal noise");
//    }
}

// I can add more classes as long as only one class is public

class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}

class Horse extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Neinei");
    }
}
