package com.pack.testPrograms;

import org.testng.annotations.Test;

import com.pack.Programs.interviewProgram;

public class testProgram {

	
	interviewProgram obj = new interviewProgram();
	
	@Test
	public void TEST_001()
	{
		obj.characterCountOptimized("beginnersbook");
	
	}
}
