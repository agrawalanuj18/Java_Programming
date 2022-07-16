public class p6 {
    public static void main(String[] args){

        // Concatenate String  

        String name1 = "Akku";
        String name2 = "Aman";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        //charAt on String 
        // Position 0 se start hoti h 

        System.out.println(name1.charAt(2));

        // Length
        System.out.println(name1.length()); 

        // replace method
        // ishhe apne orignial String me change nhi hua h 
        // humhe new String mili h 
        // String immutable hoti h 

        String name4 = name1.replace('k', 'b');
        System.out.println(name4);

        // Substring
        // Yha pe 0 postion toh include h but 3 postion nhi
        System.out.println(name1.substring(0, 3));

    }
}
