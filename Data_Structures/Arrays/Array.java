package Data_Structures.Arrays;

public class Array
{
    public static void main(String[] args)
    {
        // printing the array numbers
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(nums[3]);

        System.out.println(nums[4]);

        // updating the array numbers
        nums[3] = 5;
        System.out.println(nums[3]);

        nums[1] = 21;
        System.out.println(nums[1]);

        // Making a dynamic array
        int[] nums2 = new int[4];
        System.out.println(nums2[3]);

        // updating the new dynamic array
        nums2[2] = 10;
        System.out.println(nums2[2]);

        nums2[1] = 2;
        System.out.println(nums2[1]);

        nums2[0] = 1;
        System.out.println(nums2[0]);

        nums2[3] = 9;
        System.out.println(nums2[3]);

        // for loop for the array sequencing
        for (int i = 0; i < 4; i++)
        {
            System.out.print(nums2[i] + " ");
        }


        // Multi-Dimensional Arrays
        int[][] nums3 = new int[3][4];

        nums3[0][0] = 1;
        nums3[0][1] = 2;
        nums3[0][2] = 3;
        nums3[0][3] = 4;
        nums3[1][0] = 1;
        nums3[1][1] = 2;
        nums3[1][2] = 3;
        nums3[1][3] = 4;
        nums3[2][0] = 1;
        nums3[2][1] = 2;
        nums3[2][2] = 3;
        nums3[2][3] = 4;


        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
                System.out.print(nums3[i][j] + " ");
            {

            }
        }

        // assigning random values
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                nums3[i][j] = (int) (Math.random() * 100);
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Enhanced for loop (to return the entire array)
        for (int[] n : nums3)
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // jagged Array (means the array would be sure of the outer structure but inner structure is unknown)
        int[][] nums4 = new int[3][];     // jagged array

        nums4[0] = new int[2];
        nums4[1] = new int[3];
        nums4[2] = new int[4];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                nums4[i][j] = (int) (Math.random() * 10);
                System.out.print(nums4[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
