package TestFiles;

import java.util.*;

public class Hellos {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		int max= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum value is = "  + max);
	}


}
