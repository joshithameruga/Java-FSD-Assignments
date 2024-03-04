package polymorphism;
//OVER LOADING
class Addition {

	 //overloading with different data types
	public  int add(int a ,int b) {  //INT 
		return a+b;
	}
	public double add(double a ,double b) { //DOUBLE	
		return a+b;
	}
	
	//overloading with different number of arguments
	public int add(int a ,int b , int c) { 	
		return a+b+c;
	}

 
}
public class OverloadingMain {

	
	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.add(3,4));
		System.out.println(a.add(3,4,7));
		System.out.println(a.add(3.737 , 4.589));
	}
}
