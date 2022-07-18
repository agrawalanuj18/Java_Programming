class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ 
        // non-parameterise constuctor
        System.out.println("Constructor called");
    }
}

public class p2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        // Constructor is used for Contructing object
        // Ek object ke liye Constructor ko ek baar hi call kar sakte h
        s1.name = "Aman";
        s1.age = 22;
        s1.printInfo();

    }
}
