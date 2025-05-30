package Java_Basics;

public class Operators
{
    static class ArithmeticOperators
    {
        public static void main()
        {
            int a = 10;
            int b = 20;

            // Arithmetic operators
            // Add
            int c = a + b;
            System.out.println(c);

            // Subtract
            int d = a - b;
            System.out.println(d);

            // Multiply
            int e = a * b;
            System.out.println(e);

            // Divide (gives quotient)
            int f = b / a;
            System.out.println(f);

            // Modulus (gives remainder)
            int g = a % b;
            System.out.println(g);

            // shortcuts for single nums operators
            a += 2;
            System.out.println(a);

            a -= 2;
            System.out.println(a);

            a *= 8;
            System.out.println(a);

            a /= 8;
            System.out.println(a);

            a %= 8;
            System.out.println(a);

            // if I want to increment num 1 by 1 then lets get through it
            a++;
            System.out.println(a);

            a--;
            System.out.println(a);

            // Diff between pre increment and post increment
            int num = 7;
            int result = ++num; // pre increment
            // pre increment will first increment and then store the value of num so result will be (1 + 7) in this case
            System.out.println(result);

            int num2 = 7;
            int result2 = num2++; // post increment
            // post increment will first fetch the value then increment so in this case it will be like 7 +
            // so the answer will be 7 only
            System.out.println(result2);

        }

        private static class Relational_operators
        {
            public static void main()
            {
                // Relational operators
                int x = 8;
                int y = 9;

                // greater than
                boolean result1 = x > y;
                System.out.println(result1);

                // less than
                boolean result2 = x < y;
                System.out.println(result2);

                // not equal to
                boolean result3 = x != y;
                System.out.println(result3);

                // equals to
                boolean result4 = x == y;
                System.out.println(result4);

                // greater than equal to
                boolean result5 = x <= y;
                System.out.println(result5);

                // less than equal to
                boolean result6 = x >= y;
                System.out.println(result6);
            }
        }

        private static class Logical_operators
        {
            public static void main()
            {
                int x = 1;
                int y = 2;
                float a = 3.14f;
                float b = 3.14f;

                // AND operator {&&}
                boolean result1 = x > y && a > b;
                System.out.println(result1);

                boolean result2 = x < y && a < b;
                System.out.println(result2);

                boolean result3 = x < y && a > b;
                System.out.println(result3);

                boolean result4 = x != y && a == b;
                System.out.println(result4);

                boolean result5 = x == y && a != b;
                System.out.println(result5);

                boolean result6 = x != y && a != b;
                System.out.println(result6);

                boolean result7 = x == y && a == b;
                System.out.println(result7);

                // OR operator {||}
                boolean result8 = x < y || a < b;
                System.out.println(result8);

                boolean result9 = x > y || a > b;
                System.out.println(result9);

                boolean result10 = x < y || a > b;
                System.out.println(result10);

                boolean result11 = x > y || a < b;
                System.out.println(result11);

                boolean result12 = x != y || a == b;
                System.out.println(result12);

                boolean result13 = x == y || a != b;
                System.out.println(result13);

                boolean result14 = x != y || a != b;
                System.out.println(result14);

                boolean result15 = x == y || a == b;
                System.out.println(result15);

                // NOT operator
                boolean result16 = x != y || a == b;
                System.out.println(!result16);
            }

        }

    }
}