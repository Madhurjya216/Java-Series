

abstract class Animal {
    abstract  void name();
    abstract  void sound();
}

class Dog extends Animal {
    void name(){
        System.out.print("Doggo "); 
    }

    void sound(){
        System.out.println("Barkkk!");
    }
}

class Cat extends Animal {
    void name(){
        System.out.print("Kitty ");
    }

    void sound(){
        System.out.println("Meoww!");
    }
}

public class Main {
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.name();
        a1.sound();
        a2.name();
        a2.sound();
    }
}