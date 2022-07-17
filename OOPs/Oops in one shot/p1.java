class Pen {
    String color;
    String type; // ballpoint or gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class p1 {
    public static void main(String[] args) {
        // Introduction to OOPs
        // Important

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.printColor();
        pen1.write();
        pen1.printType();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen2.printColor();
        pen2.write();
        pen2.printType();

    }
}