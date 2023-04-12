package week2.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);//sorts data in ascending order
		//System.out.println("Array in ascending order"+data);---what is the value printed here
		System.out.println("Second Largest number is :"+data[data.length-2]);

	}

}
