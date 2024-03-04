package java8fearutes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
        System.out.println(today);
        
        LocalDate userdate = LocalDate.of(2002, 01, 15);
        System.out.println(userdate);
        
        String str = "1947-08-15";
        LocalDate republicday=LocalDate.parse(str);
        System.out.println(republicday);

        DateTimeFormatter ownformat = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String str2 = "18-01-2024";
        System.out.println(today.format(ownformat));
        
        
	}

}
