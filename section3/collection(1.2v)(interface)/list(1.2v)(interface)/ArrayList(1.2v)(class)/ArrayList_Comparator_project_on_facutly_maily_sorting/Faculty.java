package Collection1;

final public class Faculty {
	
	
	int emp_id;
	String name;
	double salary;
	String sub;
	
	public Faculty(int emp_id, String name, String sub, int salary) {
		// TODO Auto-generated constructor stub
		this.emp_id=emp_id;
		this.name=name;
		this.sub=sub;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Faculty [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + ", sub=" + sub + "]";
	}

}
