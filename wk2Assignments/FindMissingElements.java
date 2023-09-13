package wk2Assignments;

import java.util.Arrays;

public class FindMissingElements {
	
	public static void main(String[] args) {
		
		int[]input= {1,4,3,2,8,6,7};
		Arrays.sort(input);
		for(int i=0;i<=input.length;i++)
		{
			if(((input[i+1])-(input[i]))!=1)
			{
		System.out.println("Missing Number is:"+(input[i]+1));
		break;
		}
	}

}}
