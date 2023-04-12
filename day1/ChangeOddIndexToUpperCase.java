package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String test = "changeme";
		 char[] ch = test.toCharArray();
		 for (int i = 0; i < ch.length; i++)
		 {
			 if((i%2!=0))
			 {
				 System.out.print(Character.toUpperCase(ch[i]));
			 }
			 else 
			 {
				 System.out.print(ch[i]);
			 }
			 
			
		 }
		 
	}

}
