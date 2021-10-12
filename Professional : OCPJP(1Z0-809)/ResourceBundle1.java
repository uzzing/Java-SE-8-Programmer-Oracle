import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle1 {

	public static void main(String[] args) {
		
		Locale currentLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		Enumeration<String> names = messages.getKeys();
		while (names.hasMoreElements()) {
			String key = names.nextElement();
			String name = messages.getString(key);
			System.out.print(key + " " + name);
		}
	}

}
