package week2.day1;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {2,5,7,7,5,9,2,3};
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i]==a[j])
					{
						System.out.println("Array a has this number:"+""+a[i]+" as duplicate");
					}
					
				}
				
			}
	}

}
