/*
Problem: 3
@Author  : Rajesh Thokala
Date	 : 17/02/2020

John works at a clothing store.He has a large
pile of socks that he must pair by color for sale
Given an array of integers representing the color of each sock.
determine how many pairs of socks with matching colors there are .

contraints
1<=n<100
  
1<=ar[i]<=100 where 0<=i<=n
*/
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  SocksPairProblem{
	public static void main(String args[]){
	int a[]=new int[]{1,2,3,4,1,2,3,4,1,2,1,2,3,4,1,2,3,4};
	System.out.println("Count of socks pairs are "+getSocksPair(a));

	}

	static int getSocksPair(int arr[]){
	return Arrays.stream(arr).boxed().collect(
		Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.values().stream().mapToInt(a->(int)(a/2)).sum();
	}
}
