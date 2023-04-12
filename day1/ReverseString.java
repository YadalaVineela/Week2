package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="TestLeaf";
		char[] nameArray = name.toCharArray();
		for(int i=nameArray.length-1;i>=0;i--)
		{
			System.out.print(nameArray[i]);
		}
			
		}

}
