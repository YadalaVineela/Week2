package week2.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String temp="";
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitArray = text.split(" ");
		for (int i = 0; i < splitArray.length; i++)
		{
			for (int j = i+1; j < splitArray.length; j++) 
			{
				if(splitArray[i].equals(splitArray[j]))
				{
					 temp=splitArray[i];
					count++;
				}
				}
					
		}
		if(count>1) 
		{
			
			System.out.println(text.replace(temp,"" ));
		}
		
						
		}
		

	

}
