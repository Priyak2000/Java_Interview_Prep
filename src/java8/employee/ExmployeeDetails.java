package java8.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExmployeeDetails {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Priya","Developer",50000,2));
		list.add(new Employee(2,"Ammu","Tester",40000,4));
		list.add(new Employee(3,"Ravi","Hr",25000,2));
		list.add(new Employee(4,"Sri","Developer",40000,1));
		
		
		
		//sort by name
		Collections.sort(list, Comparator.comparing(Employee::getName));
		for(Employee e:list) {
			System.out.println(e);
			
		}
		
		//Sort a List of Employee by Experience, Then by Salary
		Collections.sort(list, Comparator.comparingDouble(Employee::getExperience).thenComparing(Employee::getSalary));
		//get name of emp who get highest sal
		
		
	}

}
