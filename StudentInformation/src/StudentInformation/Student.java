package StudentInformation;

public class Student {

	String name;
	int id,age;
	String phone;
	String address,department;
	
	//constructor to assign values
	Student(String name, int id, int age, String phone, String address,String department)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.department=department;		
	}
	public String getname()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public void setAddress(String newAddress) {
		this.address=newAddress;
	}
	
	public String getAddress() {
		return this.address;
	}	
	public void setPhone(String newPhone) {
		this.address=newPhone;
	}
	public String getPhone() {
		return this.phone;
	}	
	public void setAge(int newAge) {
		this.age=newAge;
	}	
	public int getAge() {
		return this.age;
	}	
	public void setDepartment(String newDepartment) {
		this.address=newDepartment;
	}
	public String getDepartment() {
		return this.department;
	}
	public static void main(String[] args)
	{
		Student s=new Student("John",1,21,"123456789","Troy","CS");
		System.out.println("Name:"+s.getname());
		System.out.println("Id:"+s.getId());
		System.out.println("Age:"+s.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Phone:"+s.getPhone());
		System.out.println("Address:"+s.getAddress());
		System.out.println("Department:"+s.getDepartment());	
	}
}
