import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	
	public static void main(String[] args) {
		int[] arr = new int[500];
		Random ranNumGenerator = new Random();
		int min =999;
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = ranNumGenerator.nextInt(500);
		    System.out.println("Random No : " + arr[i]);
		    min = Math.min(min, arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("Smallest Number is " + min);
		System.out.println("Print Nth Smallest Number ");
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		//System.out.println("Input Nth smallest No. : " + n);
		System.out.println("Nth smallest No. is : " + arr[n-1]);
	}
}
