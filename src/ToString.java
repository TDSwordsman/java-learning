public class ToString {
     public static void main(String[] args){
        Boy h1 = new Boy("Влад", 35);
        System.out.println(h1);

    }
}

class Boy{
    private String name;
    private int age;

    public Boy(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+","+age;
    }
}