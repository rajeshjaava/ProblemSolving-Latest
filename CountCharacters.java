/*
Counting the characters in string with Java8 merge and stream api's
@Author  : Rajesh Thokala
Date	 : 17/02/2020
*/
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors; 
import java.util.stream.Stream;

public class  CountCharacters{
public static void main(String args[]){
	String s="abcabcab";
	System.out.println("Freequency  with stream:\n"+countWithStreams(s));
	System.out.println("Count freequency with merge method  :\n "+countWithMapMerge(s));
}
static Map<Character,Integer>  countWithStreams(String input){
		Map<Character,Integer> freequencies=input.chars().boxed().collect(Collectors.toMap(
		k->Character.valueOf((char)k.intValue()),
		v->1, //1 occurence
		Integer::sum));//counting
		return freequencies;
}
static Map<Character,Integer> countWithMapMerge(String input){
	Map<Character,Integer> freeqs=new HashMap<Character,Integer>();
	for(char c:input.toCharArray()){
	freeqs.merge(c,// key= char
		1, //value to merge
		Integer::sum); //counting 
	}
	return freeqs;
 }
}
