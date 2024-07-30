class myexp extends Exception {
    public myexp(String er) {
        super(er); 
    }
}

class validate_age {
    public static void valid(int age) throws myexp { 
        if (age < 18) {
            throw new myexp("Teenager");
        } else {
            System.out.println("Hello");
        }
    }
}

class Validate {
    public static void main(String args[]) {
        try {
            validate_age.valid(20); 
            validate_age.valid(13); 
        } catch (myexp e) {
            System.out.println(e.getMessage()); 
        }
    }
}
