public static void main(String[] args)
{
    // Let's Try with Days of the week

    int n = 8;

    switch (n)
    {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:   // If any of the above cases are not matching then it will be used
            System.out.println("Invalid input");
    }

    // THIS HAVE A ISSUE INTO IT IF WE TRY TO USE ANY OTHER CASE.
    // IT WILL SIMPLY CHECK IT PLUS IT WILL COMPLETE THE REST OF THE LINES.
    // FOR THIS WE WILL USE BREAK STATEMENT INTO EVERY CASE.
}
