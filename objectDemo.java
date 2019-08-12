/*class calc
{
    int num1;
    int num2;
    int result;


    public void operation()
    {
        result = num1 + num2;
    }

}

public class objectDemo{
    public static void main(String str[])
    {
        calc obj;     // or =  new calc();
        obj = new calc();
        obj.num1 = 3;
        obj.num2 =5;

        obj.operation();

        System.out.println(obj.result);
      }
}*/

class calc
{
    int num1;
    int num2;
    int result;

    public calc()
    {
        num1 =5;
        num2=5;
        System.out.println("In Constructor");

    }

     public calc(int y)
    {
        num1 =y;
        num2=y;
        System.out.println("In 2nd Constructor");

    }

}

public class objectDemo{
    public static void main(String str[])
    {
        calc obj = new calc(7); //constructor
    System.out.println(obj.num1);

      }
}