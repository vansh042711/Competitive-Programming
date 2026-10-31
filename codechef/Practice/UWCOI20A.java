// Problem: UWCOI20A
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/UWCOI20A
// Solved on: 2026-10-31T18:47:52.669Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    for(int i = 0 ; i < n ;i++){
		        arr[i]= sc.nextInt();
		    }
		    int max = arr[0];
		    for(int i =1 ; i<n;i++){
		        if(arr[i]>max)
		        max= arr[i];
		    }
		    System.out.println(max);
		}

	}
}
