import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice{

public static void main(String args[]){
List<Integer> list=new ArrayList<Integer>();
		list.add(1); 
        list.add(2); 
        list.add(2); 
        list.add(4);         
		list.add(15); 
        list.add(6); 
        list.add(7); 
        list.add(8); 
        list.add(9); 
        list.add(10); 
  
        findOdd(list); 
		 // Creating a list of Integers 
        List<Integer> l = Arrays.asList(3, 4, 6, 12, 20); 
  
}
public static void findOdd(List<Integer> al){
	al.stream().filter(i->i%2==0).forEach(System.out::println);
	List<Integer> even= al.stream().filter(i->i%2==0).collect(Collectors.toList());
	Set<Integer> set=al.stream().collect(Collectors.toSet());
	System.out.println("even number " +even);
	System.out.println("set number " +set);

}
}