import java.util.Random;
public class Part1
//student name: Zhuofan Zhang
//student ID: a1806522
{
	public static void main(String[] args) 
	{	
		/* Generate 10 positive integers randomly, 
		store them in an array, 
		find the sum, and average */
		Random random =new Random();
		int rand = 0;
		int[] arrays = new int[20];
		int sum = 0;
		float avg = (float)0.0;

		//Generate array
		for(int i=0;i<10;i++)
		{
			rand=random.nextInt(20);
			arrays[i]=rand;
			System.out.print("Number(" + rand + "): ");
		for(int a=0; a<rand; ++a)
		{
			if(rand>=10)
			{
				System.out.print(">=");
			}
			else
			{
				System.out.print("<");
			}
		}			
				System.out.println("");
		}
		//Sum up
		for(int i=0; i<arrays.length; i++)
		{
			sum+=arrays[i];
		}
		//Calculate the average and printing
			avg=sum/arrays.length;
			System.out.printf("Average(" + avg + "): ");
		for(int b=1; b<=avg; ++b)
		{
			System.out.print("*");
		}
			System.out.print("");
			System.out.println();
	}
}