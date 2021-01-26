package com.pack.Programs;

public class interviewProgram {
	
	public void testprint()
	{
		System.out.println("Welcome to Selenium Testing");
	}

	
	public void characterCountOptimized(String inputString)
	{
		char[] data=inputString.toCharArray();
		int count=0;
		
		int counter[] = new int[256]; 
		
		/* say you have str = “abc” Then str.charAt(0) will be “a” Then count[‘a’] means count[97] why? 
		Because java automatically converted ‘a’ into ASCII code number 97; Then count[97] value is 0 
		when you increment it like this count[97]++ then it will become 1

		*/
		
		for (int i = 0; i < inputString.length(); i++) 
	    	counter[inputString.charAt(i)]++; 
		
		for(int i=0;i<data.length;i++)
		{
			count=0;
			for(int k=0;k<=i;k++)
			{
				if (data[i] == data [k])
				{
					count=count+1;
			
				}
			}
			
					 if (count == 1)  
			        System.out.println("Occurrence of char " + inputString.charAt(i) + " in the String is:" + counter[inputString.charAt(i)]);
			 
			
		}
	}
	
	
	
}
