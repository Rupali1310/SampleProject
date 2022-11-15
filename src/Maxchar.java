
public class Maxchar
{
	
	public static void main(String args[])
	{
	String s="rupali shaurya Sachin Gore";
	int l=s.length();
	int count=0;
	int abc=0;
	//=================================================
	for(int i=0;i<=l-1;i++)
	{	
		char s1=s.charAt(i);
		char s2=' ';
		if(s1==s2)
		{
			count--;
			
		}
		count++;
		}
		System.out.println(count+"without space");
		System.out.println(l+"Total length");
	//=====================================================
		boolean flag=false;
		for(int j=0;j<=l-1;j++)
		{
			int c=1;	
		for(int k=j+1;k<=l-1;k++)
		{
				
		if(s.charAt(j)==s.charAt(k))
		{
			c++;
			flag=true;
		}
		
		}
			
		if(flag==true)
		{
			System.out.println(s.charAt(j)+" "+c);	
		}
		}
	//===============================================
		int wcount=1;
		for(int m=0;m<=s.length()-1;m++)
		{ 
		if( s.charAt(m)==' '&& s.charAt(m+1)!=' ')
		{
			wcount++;
		}
		
		}
		System.out.println( "total words"+wcount);
		}
		}


