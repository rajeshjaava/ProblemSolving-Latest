import java.util.*;

public class NonRepeatedCharacters{
public static void main(String args[]){
	Scanner cin=new Scanner(System.in);
	String input=cin.next();
	char c=findUnique(input);


}
public char findUnique(String input){
int count,char c;
//char[] charArray=input.toCharArray();
HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
for(int i=0;i<input.length;i++){
	char c=input.charAt(i)
	if(hmap.containsKey(c))
	{
		hmap.put(c,hmap.get(c)+1);
	}
	else{
		hmap.put(c,1)
	}
}

}
}