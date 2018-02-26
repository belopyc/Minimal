


import java.util.Scanner;



public class Task{

	public static void main(String[] args)
	{
		System.out.println("This is a first java program");
		//System.out.println("Param1 :" + args[0]);
		//System.out.println("Param2 :" + args[1]);
		//System.out.println("Param3 :" + args[2]);


		Scanner in = new Scanner(System.in);

		System.out.ptintln("Enter first number");

		int first = in.nextInt();

		System.out.ptintln("Enter second number");

		int second = in.nextInt();

		System.out.ptintln("Enter third number");

		int third = in.nextInt();


		if( first  > second ) 
		{
			
			if(second < third )
			{
				System.out.ptintln("The smallest number is" );
			}
			if(third < second)
			{
				System.out.ptintln("The smallest number is"+ third );
			}
			if(second == third )
			{
				System.out.ptintln("The smallest numbers are"+ args[1] +  args[2]);
			}

		
		}

		if( first < second )
		{
			if(first  < third )
			{
				System.out.ptintln("The smallest number is"+ args[0]);
			}
			if(first > third )
			{
				System.out.ptintln("The smallest number is"+ args[2]);
			}
			if(first == third )
			{
				System.out.ptintln("The smallest numbers are"+ args[0] +  args[2]);
			}
		}
		if(args[0] == args[1])
		{
			if(second < third )
			{
				System.out.ptintln("The smallest numbers are"+ args[0] +  args[1]);
			}
			if(second > third )
			{
				System.out.ptintln("The smallest number is"+ args[2]);
			}
			if(second == third )
			{
				System.out.ptintln("All numbers are equal");
			}

		}

	}

}