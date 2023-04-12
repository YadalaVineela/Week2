package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am cool software tester"; 
		String[] splitArray = test.split(" ");
		for (int i = 0; i < splitArray.length; i++) 
		{
			//System.out.print(splitArray[i]);
			
			  if(i%2==0) 
			  { 
				  char[] charArray = splitArray[i].toCharArray();
				  for (int j = charArray.length-1;j >=0 ; j--)
				  { 
					  System.out.print(charArray[j]+" "); 
					  } 
				  } 
			  else 
				  {
			  System.out.print(splitArray[i]+" "); }
			 
			
		}
	}

}
