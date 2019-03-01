public class Runner {
    public static void main(String[] args) {
        new Animal().eat();
        new Cat().eat();
        new Cat().meow();
        new Dog().eat();
        Animal animal = new Cat();
        animal.eat();
    }
}
