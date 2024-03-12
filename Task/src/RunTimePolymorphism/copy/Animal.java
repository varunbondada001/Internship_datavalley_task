package RunTimePolymorphism.copy;
public class Animal {
    public void makeSound(){
        System.out.println("This is sound method of Animal");
        }
    }
    class Dog extends Animal{
    public void makeSound(){
        System.out.println("This is sound method of Dog");
        }
    }
    class Cat extends Animal{
    public void makeSound(){
        System.out.println("This is sound method of Cat");
        }
    }