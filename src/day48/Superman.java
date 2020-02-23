package day48;

// class birbiriyle baglantili seyleri tutarken
// interface sadece tek bir ortak nokta olsa bile objeleri bir arada tutabiliyor
public class Superman implements Flyable{

    @Override
    public void fly(){
        System.out.println("Super man flying using super power");
    }
}
