public class ThisKeyword{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName ("Влад");
        hero1.setAge(32);
        hero1.getInfo();
        Hero hero2 = new Hero();
        hero2.setName ("Саша ");
        hero2.setAge(45);
        hero2.getInfo();
    }
}

class Hero {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo() {
        System.out.println(name + "," + age);
    }
}