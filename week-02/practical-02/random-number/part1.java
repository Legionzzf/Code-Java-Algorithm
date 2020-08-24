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
		int[] arrays = new int[10];
		int sum = 0;
		double avg = 0.0;

		//Generate array
		System.out.println("The randomly generated number is: ");
		for(int i=0;i<10;i++)
		{
			rand=random.nextInt(10);
			arrays[i]=rand;
			System.out.print(rand +" ");
		}
		//Sum up
		for(int i=0;i<arrays.length;i++)
		{
			sum+=arrays[i];
		}
		//Calculate the average and printing
			avg=sum/arrays.length;
			System.out.println();
			System.out.println("The average is: "+avg);
	}
}