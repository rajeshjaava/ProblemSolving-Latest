import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors; 
import java.util.stream.Stream;
import java.util.function.Predicate;

public class  FilterMapValues{
public static void main(String args[]){
	  Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        HOSTING.put(5, "aws2.amazon.com");
		  HOSTING.put(6, "linode.com");

	 // working with person object 
	Map<Integer, Person> personsMap=new HashMap<Integer,Person>();

      personsMap.put(1,new Person("Max", 18,"10000","computers"));
      personsMap.put(2,new Person("Peter", 23,"15000","maths"));
      personsMap.put(3, new Person("Pamela", 23,"17000","computers"));
      personsMap.put(4,new Person("David", 12,"10000","physics"));


	 //Map -> Stream -> Filter -> Map
	Map<Integer, String> mapFilter =HOSTING.entrySet().stream().filter(map->map.getKey()==2).
	collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));
	System.out.println(" key filter :  "+mapFilter);
      
  //  {1=linode.com}
        Map<Integer, String> filteredMap = filterByValue(HOSTING, x -> x.contains("linode"));
        System.out.println(filteredMap);
	// filter with persons dept
		Map<Integer,Person> filterDeptPerson=filterByDeptValue(personsMap,x->x.dept.contains("computers"));
		System.out.println("filter with dept " +filterDeptPerson);
	}
 // Generic Map filterbyvalue, with predicate
    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(x -> predicate.test(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
// Generic Map Filter for value with department 
	public static <K,V> Map<K,V> filterByDeptValue(Map<K,V> map,Predicate<V> predicate){
		return map.entrySet()
			.stream()
			.filter(x->predicate.test(x.getValue()))
			.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

	}

  
}


class Person {
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    String name;
        int age;
        String salary;
        String dept;

    Person(String name, int age,String salary,String dept) {
        this.name = name;
        this.age = age;
        this.salary=salary;
        this.dept=dept;
    }

    @Override
    public String toString() {
        return name +" "+salary+" " +dept+" "+age;
    }
}

