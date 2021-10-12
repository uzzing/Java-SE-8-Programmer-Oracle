
class UserException extends Exception {}
class AgeOutOfLimitException extends UserException {}

class App {
	public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
		if (name.length() <= 60) {
			System.out.print("first");
			throw new UserException(); // throw and skip next else if statement
		} else if (age >  60) {
			System.out.print("second");
			throw new AgeOutOfLimitException();
		} else {
			System.out.print("User is registered");
		}
	}
}

public class Exception3 {

	public static void main(String[] args) throws UserException {
		
		App t = new App();
		t.doRegister("Mathew", 60);
	}

}
