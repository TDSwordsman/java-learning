public class Constructor {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
    }
}

class Cat {

    private String name;
    private int age;

    public Cat() {
        System.out.println("Первый конструктор");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}