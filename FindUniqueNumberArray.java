import java.util.*;
/*
Google  Interview Problem 

@Author  : Rajesh Thokala
Date	 : 16/02/2020
1. Given an integer array of size 2N+1 
In this given array ,N numbers are represented twice and 
once number represented only once in the array .

You need to find and return that number which is unique in the array

Time : O(n)
Space : O(1)

Ex: input N=7 [2,3,1,6,3,6,2]
out put : 1

*/

public class FindUniqueNumberArray
{
	public static void main(String args[]){
	
	int a[] =new int[]{2,3,1,6,3,6,2};
	
	System.out.println("using xor "+returnWithXORUnique(a));
	System.out.println(" using n2 complexity "+returnWithXORUnique(a));
	
	}
	public static  int returnWithXORUnique(int a[]){
	int x=0;
	for(int i=0;i<a.length;i++){
	// time complexity : n 
	x^=a[i];
		}
	return x;
	}
	public static int returnUniqeu(int a[]){
	int size=a.length;
	//with the complexity BigO(n2) 
	for(int i=0;i<size;i++){
	 for( int j=0;j<size;j++){
	 if (i !=j && a[i]==a[j])
		 break;
	 if(j==size)
		 return a[i];
	 }
	}
	return 0;
	}
}
