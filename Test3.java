//constructor of a special function 
//it has a name as of the class name
//its access specifier is always public
//it may or may not have is parameters 
//it is called as soon as the object is created 
//if you do not write a const it is autmoatically created
//interface is like abstract class 
//but isme bas abstract emthod hi hote hai 

abstract class Person {
    protected String name;
    protected int age;

    public Person() {
        System.out.println("Person -default constructor");
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = "Kamran";
        this.age = 17;
    }

    abstract void display();
}

class Employee extends Person implements ICallback {
    int empid;
    public Employee(String name, int age,int empid) {
        this.name=name;
        this.age=age;
    }
    @Override
    public void callback() {
        System.out.println("Callback Method Called");
    }

    @Override
    void display() {
        System.out.println("Display called");
    }
    
}

public class Test3 {
    public static void main(String[] args) {
        Employee p1 = new Employee("Kamran",17,17);
    }
}
