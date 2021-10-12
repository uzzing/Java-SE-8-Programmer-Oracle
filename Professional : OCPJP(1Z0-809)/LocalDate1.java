import java.time.LocalDate;
import java.time.Month;

public class LocalDate1 {

	public static void main(String[] args) {
		LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 1);
		LocalDate next15days = valentinesDay.plusDays(29);
		LocalDate nextYear = next15days.plusYears(1);
		
		System.out.print(nextYear);
		
	}

}
