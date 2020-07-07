package lambda;

public class lambda {

	public lambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambda lambda = new lambda();

		HelloOperation printHello = (String a) -> a + " World";

		System.out.println(lambda.operate("Hello", printHello));

	}

	interface HelloOperation {
		String operation(String a);
	}

	private String operate(String a, HelloOperation mathOperation) {
		return mathOperation.operation(a);
	}

}
