public static void main(String[] a)
{
    // let's create a calendar/ schedular / planner for weekly activities.
    // We will check for nested loops in this case.
    for (int i = 1; i < 6; i++)
    {
        System.out.println("Day of Week: " + i);

        for (int j = 9; j <= 17; j++)
        {
            System.out.println("Time slot" + " " + (j) + " - " + (j + 1) + " - ");
        }
    }
}