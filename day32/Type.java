class Type {
    public static void main(String args[]) {
        int myInt = 9;
        double myDouble = myInt;  // Automatic Casting    
        
        // Manual Casting
        int myIntFromDouble = (int) myDouble;

        // String Concatenation

        String firstName = "Harikrihna";
        String lastName = "Gautam";

        System.out.println("Original int value: " + myInt);
        System.out.println("Converted double value: " + myDouble);
        System.out.println("Converted double to int: " + myIntFromDouble);
        System.out.println(firstName + " " + lastName);

        // Java Math

        System.out.println(Math.max(6,8));
    }
}
