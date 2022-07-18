class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((l * h) / 2);
    }

}

public class SingleLevel {
    public static void main(String[] args) {
        Triangle a1 = new Triangle();
        a1.area(5, 4);
    }
}
