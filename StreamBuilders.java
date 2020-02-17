import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilders {

     public static void main(String[] args){
         List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         // stream count 
            long count=list.stream().count();
        //limit 
            System.out.println("fileter value :"+   list.stream().filter(i->i>5).count());
            System.out.println("count is "+count);
         List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
         System.out.print(evenNumbersList);
        // filter operations 
        List<String> nameList = Arrays.asList("Ram", "Amit", "Ashok", "Manish", "Rajat");
        nameList.stream().filter(n->n.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

        nameList.stream().filter(n -> !n.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
	//map
	list.stream().map(n->n*2).filter(n->n>10).forEach(System.out::println);

    //complex operations
    List<Person> persons =
    Arrays.asList(
        new Person("Max", 18,"10000","computers"),
        new Person("Peter", 23,"15000","maths"),
        new Person("Pamela", 23,"17000","computers"),
        new Person("David", 12,"10000","physics"));

// grouping the objects with age 

    List<Person>p1= persons.stream().filter(n->n.name.startsWith("P")).collect(Collectors.toList());
    System.out.println(p1);
    Map<Integer,List<Person>> personWithGroupBy=persons.stream().collect(Collectors.groupingBy(p->p.age));
    personWithGroupBy.forEach((age,p)->System.out.format("age %s: %s\n", age, p));
//grouping the persons with department 

    Map<String,List<Person>> personsWithGroupByDept=persons.stream().collect(Collectors.groupingBy(Person::getDept));
    personsWithGroupByDept.forEach((dept,p)->System.out.println(" dept : "+dept+"  "+p));
    
// grouping the persons with salary 
    Map<String,List<Person>> personWithSalary= persons.stream().collect(Collectors.groupingBy(p->p.salary));
    personWithSalary.forEach((salary,p)->System.out.println("salary :"+salary+"  "+p));

Map<String,List<Person>> personWithDept=persons.stream().collect(Collectors.groupingBy(p->p.dept));
personWithDept.forEach((dept,p)->System.out.println("dept : "+dept+ " "+p));

//sorting persons based on person name

	persons.sort(Comparator.comparing(p->p.name));
		System.out.println("sorted list "+persons);
	persons.sort(Comparator.comparing(p->p.dept));
	System.out.println("sorted with dept "+persons);

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
