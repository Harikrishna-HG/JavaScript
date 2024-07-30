interface A{
  void display();
}

class B implements A{
  public void display()
  {
    System.out.println("Derived class B");
  }
}
class C implements A{
  public void display()
  {
    System.out.println("Derived class C");
  }
}
class Interface
{
  public static void main(String args[])
  {
    A d = new B();
    d.display();
  }
}