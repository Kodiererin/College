package Nov22;

public class reverse 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String m = sc.nextLine();
		String n = "";
		String o = "";
		for(int i=m.length()-1 ; i>=0 ;  i--)
		{
			n+=m.charAt(i);
		}
		n+=" ";
		String myString="";
		String xyz ="";
		for(int i=0 ; i<n.length() ; i++)
		{
			xyz += n.charAt(i);
			if(n.charAt(i)==32)
			{
				myString = xyz+myString;
				xyz="";
			}
		}
		System.out.println(myString);
	}
}
