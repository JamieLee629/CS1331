//Modify ExceptionPractice to add method1 which contains a nullpointerexception
//which it throws back to the main method

public class ExceptionPractice2 {
	public static void main(String[] args) {
		try {
			method1();
		}
		catch (NullPointerException e) {
			System.out.println("Oops! That item is null.");
		}

		try {
			//System.out.println(1 / 0);  //arithmetic exception  ( 1.)
			String name = "Joe";
			System.out.println(name.charAt(8));
		}
		catch (ArithmeticException ae){
			System.out.println("Calculations could not be completed");
		}
		catch (Exception e) {
			System.out.println("An exception occurred.");  //( 2.) terminates the try block
		}
		finally {
			System.out.println("Cleaning up stuff");
		}
		System.out.println("Rest of the main method");

		//if you have another code block that might throw one of the above catch statments,
		//you have to create a completely new try-catch block
	
	}
	public static void method1() throws NullPointerException {
		String nothing = null;
		System.out.println(nothing.toString());
		//throw new NullPointerException(); **Don't need to run this line b/c the toSTring method throws the exception
	}

	public static void method1a() throws NullPointerException, StringIndexOutOfBoundsException {
		//we can have a method that throws 2 exceptions
		//what will happen if we run method1a()?
		String nothing = null;
		System.out.println(nothing.toString());
		System.out.println(nothing.charAt(19); //Nothing handles this in the main method. There should be a catch for this
											   //exception in the main method.
	}
}

