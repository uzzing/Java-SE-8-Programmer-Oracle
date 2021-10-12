import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.of(2014,7,31);
		
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		
	}

}
