
class Student {
	String name;
	int age;
	
}

public class TestGarbage {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		
		s1 = s3;
		s3 = s1;
		s2 = null;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
