class Function
{
  public static void main(String args[])
  {
    // Java Booleans
    int x = 40;
    int y = 20;
    System.out.println(x>y);

    // Java Else If

    int time = 22;
    if (time < 12){
      System.out.println("Good morning.");
    }
    else if (time < 18)
    {
      System.out.println("Good day.");
    }
    else{
      System.out.println("Good evening.");
    }

    // Ternary Operator

    int times = 16;
    String result;
    result = (times < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    // Java Switch Statements

    int day = 6;
    switch (day){
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Not mentioned");
    }

    // Java While Loop

    int i = 0;
    while (i < 5)
    {
      System.out.println(i);
      i++;
    }

    // Java Do/While Loop

    int t = 0;
    do{
      System.out.println(t);
      t++;
    }
    while (i < 5);

    // Nested Loop

    for (int h = 1; h <= 2; h++)
    {
      // Outer loop
      System.out.println("Outer: " + h);

      // Inner loop
      for (int g = 1; g <= 3; g++)
      {
        System.out.println("Inner: " + g);
      }
    }

    // For- Each Loop

    String[] cars = {"BMW", "Ford", "Mercedes", "Rolls Royce"};
    for (String k : cars)
    {
      System.out.println(k);
    }

    // Real life example

    for (int m = 0; m <= 100; m = m + 10)
    {
      System.out.println(m);
    }

    // Java Break

    for (int z = 0; z < 10; z++)
    {
      if (z == 4)
      {
        break;
      }
      System.out.println(z);
    }

    // Java Continue

    for (int o = 0; o < 10; o++)
    {
      if(o == 4)
      {
        continue;
      }
      System.out.println(o);

    }
  }
}