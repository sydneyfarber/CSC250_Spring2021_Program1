
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "Mark";
		int count = 0; 
		for(int i = 0; i < s.length(); i++)
		{
			if(isVowel2(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean isVowel2(char c)
	{
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'; 
	}
	
	static boolean isVowel1(char c)
	{
		if (c == 'a')
		{
			return true;
		}
		else if(c == 'e') 
		{
			return true;	
		}
		else if(c == 'i') 
		{
			return true;	
		}
		else if(c == 'o') 
		{
			return true;	
		}
		else if(c == 'u') 
		{
			return true;	
		}
		else if(c == 'A') 
		{
			return true;	
		}
		else if(c == 'E') 
		{
			return true;	
		}
		else if(c == 'I') 
		{
			return true;	
		}
		else if(c == 'O') 
		{
			return true;	
		}
		else if(c == 'U') 
		{
			return true;	
		}
		else
		{
			return false;
		}		
	}
}
