package com.pack.Programs;

public class interviewProgram {
	
	public void testprint()
	{
		System.out.println("Welcome to Selenium Testing");
	}

	
	public void characterCount(String inputString)
	{
		char[] data=inputString.toCharArray();
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			for(int k=0;k<data.length;k++)
			{
				if (data[i] == data [k])
				{
					count=count+1;
					
				}
			}
			
			System.out.println("Occurance of Character:  " + data[i]+ ": "+  count);
			count=0;
			
		}
	}
	
	
	public void characterCountOptimized(String str)
	{
		
		 int len = str.length(); 
	        int counter[] = new int[256];     
	        
	        
	        /* say you have str = “abc” Then str.charAt(0) will be “a” Then count[‘a’] means count[97] why? 
	        		Because java automatically converted ‘a’ into ASCII code number 97; Then count[97] value is 0 
	        		when you increment it like this count[97]++ then it will become 1
	        
	        		*/
	        for (int i = 0; i < len; i++) 
		    	counter[str.charAt(i)]++; 
		    	
		    char[] array= new char[str.length()]; 
		    System.out.println("Welcome");
		    
		    for (int i = 0; i < len; i++) 
		    { 
		        array[i] = str.charAt(i); 
		        int flag = 0; 
		        for (int j = 0; j <= i; j++) 
		        { 

	    		    if (str.charAt(i) == array[j])  
				    flag++;                 
		        } 
		        if (flag == 1)  
		        System.out.println("Occurrence of char " + str.charAt(i) + " in the String is:" + counter[str.charAt(i)]); 
		   	}
	}
}
