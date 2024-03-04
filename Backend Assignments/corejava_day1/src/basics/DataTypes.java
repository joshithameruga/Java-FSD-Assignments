package basics;

public class DataTypes {
	//primitive data types(specific size is predefined for example byte size is from -128 to 127 and int is 2 bytes so on)
		public static void main(String[] args) {
			byte age=30;  // byte = 8 bits   
			int phone=1234567890; // 4 bytes       //short data type is 2 bytes 
			long otherphone=12345678900L; //can keep small l also  8 bytes
			float pivalue=3.14F; 
			char surname='M';
			boolean ischild=false; //1 bit
			System.out.println(age);
			System.out.println(phone);
			System.out.println(otherphone);
			System.out.println(pivalue);
			System.out.println(surname);
			System.out.println(ischild);
			
	//non-primitive data types(no specific size pre determined like in primitive data types)
			String name="joshitha";
			String friend="varshitha";
			System.out.println(name);
			System.out.println(friend);
			
	// You can also declare a variable without assigning the value, and assign the value later:
			int mynum;
			mynum=15;
			System.out.println(mynum);
			

			mynum=25;
			System.out.println(mynum);
		
	// if we dont want to overwrite then we use final keyword
			 //final int mynum=15;
			
		}
		
}
