package ch00.sec03;

public class MyfunctionInterfaceExample {

	public static void main(String[] args) {
		MyFunctionInterface fi;
		
		fi = (x, y)->{
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) ->{return x + y;};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return(x+y);
	}

}
