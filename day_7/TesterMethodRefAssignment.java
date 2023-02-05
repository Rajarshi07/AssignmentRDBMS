package day_7;

@FuncInterfaceTester
interface MethodRefInterface {
	Person getPerson(String name, int age);
}

public class TesterMethodRefAssignment {
	public static void main(String[] args) {
		MethodRefInterface obj = Person::new;
		System.out.println(obj.getPerson("Rajarshi", 22));
	}
}
