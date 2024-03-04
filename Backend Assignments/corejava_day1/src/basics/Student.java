package basics;

// CLASS AND OBJECT CONCEPT
public class Student{
      
	int id;
	String name ;

	void greeting() {
		System.out.println("hello "+name+" your id is " +id);
		
	}




public static void main(String args[]) {
   Student s1 = new Student();
   s1.id=1;
   s1.name="ravi";
   
   Student s2 = new Student();
   s2.id=2;
   s2.name="raju";
   
   s1.greeting();
   s2.greeting();
   
}
}

