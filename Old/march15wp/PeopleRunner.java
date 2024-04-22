public class PeopleRunner {
	public static void main(String args[]) {
		Student s = new Student("John");
        s.printInfo();
        Teacher t = new Teacher("Jose");
        t.printInfo();
	}
	
}

class People {
	private String name;
    public People(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printInfo() {
        System.out.println("I go to mountain view high school!");
    }
}

class Teacher extends People {
	public Teacher(String name) {
        super(name);
    }
	@Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("my name is " + getName() + " and I am a teacher!");
    }
}

class Student extends People {
	public Student(String name) {
        super(name);
    }
	@Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("my name is " + getName() + " and I am a student!");
    }
}