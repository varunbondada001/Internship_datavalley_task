package RunTimePolymorphism.copy;
public class Main {
    public static void main(String[] args) {
        Animal an = new Dog();
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); 
        cat.makeSound(); 
    }
}