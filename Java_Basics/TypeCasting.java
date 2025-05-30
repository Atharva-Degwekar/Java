public static void main()
{
    // this will not work as byte size is smaller than int size.
    byte b = 127;
    System.out.println(b);

    int a = 256;
    System.out.println(a);

    boolean c = (b == a);
    System.out.println(c);

    // after type casting and conversion
    int e = (int) b;
    System.out.println(b);

    // another example of type casting
    float f = 3.14f;
    int d = (int) f;
    System.out.println(d);

    // modulus operation for conversion of the byte code for the purpose so it works like => 1289 % 256 = 9
    int x = 1289;
    byte y = (byte) x;
    System.out.println(y);

    // Type promotions in java
    byte v = 10;
    byte w = 40;
    int result = (v * w);
    System.out.println(result);
}

