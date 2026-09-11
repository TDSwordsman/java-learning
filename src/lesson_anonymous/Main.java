package lesson_anonymous;

public class Main {
    public static void main(String[] args) {

        AbleToEat creature = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Кто-то ест через анонимный класс!");
            }
        };

        creature.eat();
    }
}
