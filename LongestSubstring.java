import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcabcdefghi";
		
		HashSet<Character> set = new HashSet<>();
		
		int startIndex = 0;
		
		int count = 0, maxCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(set.contains(str.charAt(i)))
			{
				if(count > maxCount)
				{
					maxCount = count;
				}
				count=0;
				startIndex = i;
				set.clear();
				
			}
			
			set.add(str.charAt(i));
			count++;
		}
		
		if(count>maxCount )
			maxCount = count;
		
		System.out.print("Longest substring without repeating:"+str.substring(startIndex,maxCount+startIndex));
		
	}

}
