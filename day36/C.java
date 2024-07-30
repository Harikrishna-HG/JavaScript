interface A
{
  void methodA();
}
interface B
{
  void methodB();
}
class C implements A, B{
  public void methodA()
  {
    System.out.println("Within Class C of Method A");
  }
  public void methodB()
  {
    System.out.println("Within class C of method B");
  }
  public static void main(String args[])
  {
    C obj = new C();
    obj.methodA();
    obj.methodB();
  }

}