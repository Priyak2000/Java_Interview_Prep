package java8.employee;

public class Employee {
	int id;
	String name;
	String designation;
	double sal;
	int exp;
	public Employee(int id, String name, String designation, double sal, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.sal = sal;
		this.exp = exp;
	}
	
	public Employee() {
		super();
		
	}

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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", sal=" + sal + ", exp="
				+ exp + "]";
	}
	
}
