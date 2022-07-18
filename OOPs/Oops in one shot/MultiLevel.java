class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

}

class EquilateralTriangle extends Triangle {

}

public class MultiLevel {
    public static void main(String[] args) {

    }
}
