Exception Handling
catching an exception means you handle it
Throwing an exception (whoever using the code makes the decision
of what happens when an error happens)

**Know the exception types chart

Exception is a subclass of throwable.
Error - things that usually cannot be handled (memory problem w/ operating system or soemthing;
    mainly for systems level programming) - but it is a subclass of throwable too.

Checked exceptions vs unchecked exceptions
CHecked - compiler checks the exception. Code will not compile if you do not fix all checked exceptions.

All RuntimeExceptions are unchecked exceptions! Compiler does not require you to fix.

Using a class that throws an IO exception, it will not compile unless you handle it!

Unchecked exceptions: Java does not mandate you tor write code to catch unchecked exceptions (but you
    probably should)

The scanner class produced unchecked exceptions (you did not have to handle them)

Most common exceptions are usually unchecked exceptions.

You should order catch clauses from most specific to least specific!

trace the code on slide 41

prints:
"Wee!"
"I'm still running."

Exception handling is not efficient

If you want the exception to be handled by the caller, then we create exceptions. If you can handle
the error yourself with an if statement, you should use an if statement.

For example, you do not need to throw a null pointer exception for null pointer exceptions. You can just
create an if statement that makes sure the thing != null.

You will mostly need exceptions to hand the exception to the library user (if you are creating your own library
    that other people will be using).

System.out.println(1.0/0); DOES NOT THROW Exception

you have to say throws in the method signature if you need it to throw an exception.

Do chapter 12 checkpoint exercises

Creating an exception class:

public class myException extends Exception {
    public myException(); //Constructor
}

Don't create an exception class if you don't have to. Only do it when there is no other option.