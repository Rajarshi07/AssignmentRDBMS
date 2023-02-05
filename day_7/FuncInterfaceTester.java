package day_7;

@FunctionalInterface
interface FuncInterface {
	abstract int cube(int a);

	default int square(int a) {
		return a * a;
	}

	default int add(int i, int j) {
		return i + j;
	}

	static int sub(int i, int j) {
		return i - j;
	}

	static int mul(int i, int j) {
		return i * j;
	}

	static double div(int i, int j) {
		return i / j;
	}
}

public class FuncInterfaceTester {
	public static void main(String[] args) {
		FuncInterface obj = (int a) -> a * a * a;

		System.out.println("cube = " + obj.cube(5));
		System.out.println("square = " + obj.square(6));
		System.out.println("add = " + obj.add(2, 4));
		System.out.println("sub = " + FuncInterface.sub(23, 6));
		System.out.println("mul = " + FuncInterface.mul(3, 7));
		System.out.println("div = " + FuncInterface.div(4, 2));
	}
}