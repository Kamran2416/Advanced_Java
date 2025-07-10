class Person {
    public String name;
    public int age;
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("hello visuallabs");
        Person p = new Person();
        p.name = "Faiz";
        p.age = 19;
        System.out.println(p.name + " " + p.age);
        Person p2 = new Person();
        p2.name = "Faiz";
        p2.age = 19;
        System.out.println(p2.name + " " + p2.age);
    }

}
