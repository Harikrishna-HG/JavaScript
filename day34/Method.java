class Method{
  static void myMethod()
  {
    System.out.println("I just got executed!");
  }
  public static void main(String args[])
  {
    myMethod();
    // A method can also be called multiple times
    myMethod();
    myMethod();
    myMethod();
  }
}