/*
Google Coding Interview Problem :2

@Author  : Rajesh Thokala
Date	 : 16/02/2020
1. Given a number n,
put all elements from 1 to n in an array
in order  - 1,3,5...,4,2.

Time : O(n)
Space : O(1)

Ex: input n=9
output : 1,3,5,7,9,8,6,4,2

*/

public class GoogleProblem2{
public static void main(String args[]){
	//initialising the n and creating the variables
	int n=9;
	int count=1,i,j;
	int arr[]=new int[n];
	/*
	takes n iterations to compute , total BigO(n) will
	be the complexity of time 
	*/
	for (i=0,j=n-1;i<j ;i++,j--)
	{
	arr[i]=count++;
	arr[j]=count++;
	}
	if(i==j){
	arr[i]=count;
	}
	
	for (int values:arr )
	{
		System.out.println(values);
	}
 }
}