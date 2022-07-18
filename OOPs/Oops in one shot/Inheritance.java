class Shape {
    // Base class PArent classs
    String color;
}

class Triangle extends Shape {
    // Child class

}

public class Inheritance {
    // Ek class ki properties ko dusre me transfer karna
    // reusualbilty increase ho jaati h
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
