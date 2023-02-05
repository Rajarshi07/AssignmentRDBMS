package day_7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public boolean setSalary(double salary) {
		this.salary = salary;
		return true;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class MapDemo {

	public MapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> el=new ArrayList<Employee>();
		List<Employee> el2=new ArrayList<Employee>();
		el.add(new Employee(101,"ABCD",15000));
		el.add(new Employee(102,"EFGH",16000));
		el.add(new Employee(103,"IJKL",17000));
		el.add(new Employee(104,"MNOP",18000));
		el.add(new Employee(105,"QRST",19000));
		el2=el.stream().map(e->new Employee(e.getId(),e.getName(),e.getSalary()*1.1)).collect(Collectors.toList());
//		el.forEach(n->System.out.println(n));
		el2.forEach(n->System.out.println(n));
		
		

	}

}
