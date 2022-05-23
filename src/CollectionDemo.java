import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


class SortByName implements Comparator<Employee>



{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}}


public class CollectionDemo {

	public static void main(String[] args) {
		System.out.println("**********New updates ***********");
		TreeSet<Employee> tsemp=new TreeSet<Employee>();
		tsemp.add(new Employee(101, "Shakib", "Intern", 22));
		tsemp.add(new Employee(102, "Arun", "Intern", 22));
		tsemp.add(new Employee(103, "Aakash", "Intern", 23));
		tsemp.add(new Employee(104, "Gauri", "Intern", 22));
		tsemp.add(new Employee(105, "Mahesh", "Intern", 23));
		
		tsemp.stream().forEach(t ->System.out.println(t));
		System.out.println("-------------------Name in descending order----------------");

		TreeSet<Employee> tsempByName = new TreeSet<Employee>(
		(Employee o1, Employee o2)->o2.getEmployeename().
		compareTo(o1.getEmployeename()));
		
		tsempByName.add(new Employee(101, "Shakib", "Intern", 22));
		tsempByName.add(new Employee(102, "Arun", "Intern", 22));
		tsempByName.add(new Employee(103, "Aakash", "Intern", 23));
		tsempByName.add(new Employee(104, "Gauri", "Intern", 22));
		tsempByName.add(new Employee(105, "Mahesh", "Intern", 23));
		
		tsempByName.stream().forEach(t ->System.out.println(t));
	}


}

