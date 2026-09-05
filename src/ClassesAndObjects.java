public class ClassesAndObjects {
    public static void main(String[] args) {
        Human person1 = new Human();
        person1.name = "Иван";
        person1.age = 17;
        person1.speak();

        Human person2 = new Human();
        person2.name = "Кирилл";
        person2.age = 37;
        person2.speak();
    }
}

// Новый класс Person с методом speak
class Human {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
}
