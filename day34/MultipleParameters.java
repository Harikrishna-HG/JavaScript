class MultipleParameters
{
  static void myMethod(String fname, int age)
  {
    System.out.println(fname + " is "+ age);
  }

  public static void main(String args[])
  {
    myMethod("Harikrishna",18);
    myMethod("Prakash", 28);
    myMethod("Anu", 24);
  }
}