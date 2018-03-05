package immutableClass;

final public class Student {
	final String name;
	final String add = "dorman";
	
	public Student(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "this class is imutable class";
	}
}
