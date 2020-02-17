
import java.util.Arrays;
import java.util.List;


public class LambdaPractice {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		people.forEach(p->System.out.println(p));
	
		// Step 1: Sort list by last name
		people.sort((p1,p2)->p1.lastName.compareTo(p2.lastName));
		System.out.println("After Sorting");
	
		
		// Step 2: Create a method that prints all elements in the list
		people.forEach(p->System.out.println(p));
		List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		// Step 3: Create a method that prints all people that have last name beginning with C 
		people.stream()
		.filter((p)->p.lastName.startsWith("C"))
		.forEach(p->System.out.println(p.lastName));

	//	filter(languages,p->p.lastName.startsWith("C"));
	//	people.stream().filter(startWithC).forEach((p)->System.out.println(p));
//	 filter(languages, (str)->str.startsWith("J"));

	}

}
class Person
{
	public String firstName;
	public String lastName;
	public int age;
	Person(String firstName,String lastName,int age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
}
public String toString(){
return "firstName :"+firstName+" lastName : "+lastName;
}
}