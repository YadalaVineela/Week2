package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			//System.out.println(arr[i]);
			
			 if(arr[i]!=i+1) 
			 { 
				 System.out.println("Missing number is :"+(i+1)); 
				 break;
		     }
			 
			
		}

	}

}
