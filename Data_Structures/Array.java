package Data_Structures;

public class Array
{
	public static void main(String[] args)
	{
		// // printing the array numbers
		// int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		//
		// System.out.println(nums[3]);
		//
		// System.out.println(nums[4]);
		//
		// // updating the array numbers
		// nums[3] = 5;
		// System.out.println(nums[3]);
		//
		// nums[1] = 21;
		// System.out.println(nums[1]);
		//
		// // Making a dynamic array
		// int[] nums2 = new int[4];
		// System.out.println(nums2[3]);
		//
		// // updating the new dynamic array
		// nums2[2] = 10;
		// System.out.println(nums2[2]);
		//
		// nums2[1] = 2;
		// System.out.println(nums2[1]);
		//
		// nums2[0] = 1;
		// System.out.println(nums2[0]);
		//
		// nums2[3] = 9;
		// System.out.println(nums2[3]);
		//
		// // for loop for the array sequencing
		// for (int i = 0; i < 4; i++)
		// {
		// 	System.out.print(nums2[i] + " ");
		// }
		//
		// // Multi-Dimensional Arrays
		// int[][] nums3 = new int[3][4];
		//
		// nums3[0][0] = 1;
		// nums3[0][1] = 2;
		// nums3[0][2] = 3;
		// nums3[0][3] = 4;
		// nums3[1][0] = 1;
		// nums3[1][1] = 2;
		// nums3[1][2] = 3;
		// nums3[1][3] = 4;
		// nums3[2][0] = 1;
		// nums3[2][1] = 2;
		// nums3[2][2] = 3;
		// nums3[2][3] = 4;
		//
		// for (int i = 0; i < 3; i++)
		// {
		// 	for (int j = 0; j < 4; j++)
		// 	{
		// 		System.out.print(nums3[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		//
		// // assigning random values
		// for (int i = 0; i < 3; i++)
		// {
		// 	for (int j = 0; j < 4; j++)
		// 	{
		// 		nums3[i][j] = (int) (Math.random() * 100);
		// 		System.out.print(nums3[i][j] + " ");
		// 	}
		// 	System.out.println(" ");
		// }
		//
		// // Enhanced for loop (to return the entire array)
		// for (int[] n : nums3)
		// {
		// 	for (int m : n)
		// 	{
		// 		System.out.print(m + " ");
		// 	}
		// 	System.out.println();
		// }
		//
		// // jagged Array (means the array would be sure of the outer structure but inner structure is unknown)
		// int[][] nums4 = new int[3][];     // jagged array
		//
		// nums4[0] = new int[2];
		// nums4[1] = new int[3];
		// nums4[2] = new int[4];
		//
		// for (int i = 0; i < 3; i++)
		// {
		// 	for (int j = 0; j < nums4[i].length; j++)
		// 	{
		// 		nums4[i][j] = (int) (Math.random() * 10);
		// 		System.out.print(nums4[i][j] + " ");
		// 	}
		// 	System.out.println(" ");
		// }
		//
		// // Three-dimensional arrays
		//
		// // int [][][] nums5 = new int[3][4][5];
		// // System.out.println(nums5[4][5][6]);
		//
		// // mistake above the numbers are not present as we are declaring the array like 3 arrays of 4 rows and 5 columns
		// // so we can clearly see that we are getting the ArrayOutOfBoundsException rising.
		//
		// int[][][] nums6 = new int[3][4][5];
		// System.out.println(nums6[0][0][0]);

		// Length of an Array-:

		int[] nums7 = new int[6];
		nums7[0] = 1;
		nums7[1] = 2;
		nums7[2] = 3;
		nums7[3] = 4;

		// but if by mistake we put 7 instead or any other number greater than the length it will throw an error that is ArrayOutOfBounds
		// for eg-:
		// for (int i = 0; i < 7; i++)               // throws an error -: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		// at Data_Structures.Arrays.Array.main(Array.java:131)
		// for(int i = 0; i < 6; i++)
		// {
		// 	System.out.println(nums7[i] + " ");
		// }

		// To avoid such mistakes we can use the length function.
		// here we know the length but when we are implementing the multimodule project
		// in that we cannot waste our time figuring out where is the array and what is the max size of it
		// so we can use-:

		for (int i = 0; i < nums7.length; i++)
		{
			System.out.println(nums7[i] + " ");
		}

		// Now lets see if we can fetch the value from multiple objects of students

		class Students
		{
			int roll_no;
			String name;
			int marks;
		}

		// let's create different objects
		Students s1 = new Students();
		s1.roll_no = 1;
		s1.name = "John Smith";
		s1.marks = 10;

		Students s2 = new Students();
		s2.roll_no = 2;
		s2.name = "Jane Doe";
		s2.marks = 20;

		Students s3 = new Students();
		s3.roll_no = 3;
		s3.name = "Jane Smith";
		s3.marks = 30;

		// if we directly fetch the student value it will print it in some address type format
		// System.out.println(s1);                o/p-: Data_Structures.Arrays.Array$1Students@a09ee92

		// so we can do one thing-:
		// but this is fetching only one student
		System.out.println(s1.name + " " + " , " + s1.roll_no + " , " + " " + s1.marks);

		Students student[] = new Students[3];       // here we are not creating 3 student objs we are creating an array which can hold the reference of students
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;

		// therefore we can use the for loop

		for (int i = 0; i < student.length; i++)
		{
			System.out.println(student[i].name + " : " + student[i].marks);
		}

		// now there is another way through which we can print the values
		// instead of getting all the values at once we can print the values using for loop
		// we can call it as enhanced for loop or for - each loop.
		
		for (Students s : student)
		{
			System.out.println(s.name + " : " + s.marks);
		}

	}
}