public class p14 {
    public static void main(String[] args) {
        // Comparsion Operator
        // a == b
        // a != b
        // a > b, a<b
        // a>= b , a<=b

        // Conditional Statements

        // if - else Statements
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        int age = 25;
        if (age >= 18)
            System.out.println("Can vote");
        else
            System.out.println("can't vote");

        // Logical Operator
        // && dono ko satisfy karna important h
        // || kisi ek ko satisfy karna hoga

        int a = 45;
        int b = 54;
        if (a > 40 && b < 60)
            System.out.println("Both condition satisfy");
        else
            System.out.println("Both condition are not Satisfy");
        int c = 45;
        int d = 54;
        if (c > 40 || d < 40)
            System.out.println("Atleast One Condition Satisfy");

        else
            System.out.println("None of the condition Satisfy");

        // Not Operator !

        if (!(c > 40 || d < 40))
            System.out.println("Atleast One Condition Satisfy");

        else
            System.out.println("None of the condition Satisfy");
    }
}
