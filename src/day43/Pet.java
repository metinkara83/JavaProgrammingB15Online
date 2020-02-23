package day43;

public class Pet {
//    Pet
//          attributes
//             type
//             name
//          constructor :
//              no arg constructor
//                  set the type to "unknown"
//                  set the name to "noname"
//              2 args constructor
//                  set the name and breed to what the caller passed
//
//    behaviours
//           getters , setters , toString
//           speak : void method with no arg
//                  accept no parameter
//                  according to the type speak following
//                      cat --> meow
//                      dog --> woof
//                      cow --> mooo
//                      horse --> neinei

    private String type;
    private String name;

    public Pet(){
        this.type="unknown";
        this.name="no-name";
    }

    public Pet(String type, String name){
        this.type=type;
        this.name=name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak() {
        switch(type.toLowerCase()){
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            case "horse":
                System.out.println("neinei");
                break;
            default:
                System.out.println();
                break;
        }
    }

    // If your method does not read or modify object attribute, you can just make it static
    public static void showGeneralPetInfo(){
        System.out.println("Pets are friends of Humans");
        // This will not work
        // Static method cannot access anything other than static
//        System.out.println(name);
    }
}
