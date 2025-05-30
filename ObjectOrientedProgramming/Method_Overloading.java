package ObjectOrientedProgramming;

public class Method_Overloading
{
    /*
    Method Overloading is methods having same name but different parameters.
    */
}

class Calculator2
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public double add(double a, int b)
    {
        return a + b;
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Calculator2 obj = new Calculator2();
        int r1 = obj.add(2,4, 12);
        System.out.println(r1);
    }
}
