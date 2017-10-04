
class Member {

	
		// TODO Auto-generated method stub
		String Name;
		int age;
		Double salary;
		
		

	}


public class MemberVariable{
	
	public static void main(String[] args) {
		Member emp = new Member();
		emp.Name = "Lolu";
		emp.age  =  30;
		emp.salary = 10000.30;
		System.out.println("Members Name: "+emp.Name);
        System.out.println("Members Age: "+emp.age);
        System.out.println("Members Salary: "+emp.salary);
		
		
	}
}
