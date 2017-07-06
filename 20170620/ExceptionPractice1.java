public class ExceptionPractice1 {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);  //arithmetic exception  ( 1.)
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
}

