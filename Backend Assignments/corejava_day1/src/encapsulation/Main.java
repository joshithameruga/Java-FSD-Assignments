package encapsulation;




class Student {
	// Encapsulating the name and age
	
	private String name;
	private int age;

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
}


public class Main {

	public static void main(String[] args)
	{
		
		Student s = new Student();
		s.setName("raju");
		s.setAge(13);

		// Using methods to get the values from the
		// variables
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
	}
}
