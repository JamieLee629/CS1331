Abstract classes:
A class that is so broad that it is more of a concept than an object.

Similar to regular classes, but you cannot instantiate.
Can have some or no abstract methods.
Can have constructor to set up instance vars. Only use when making a
super call from the subclass.
Can be used as a data type. But you cannot do
Person p = new Person() if person is an abstract class.

What is an abstract method?
No parameters, no implementation. A method signature followed by a semicolon.
In an abstract class, you need to use the abstract keyword.

abstract method();

Why abstract method?
When you assume that your subclass will have the methods in the abstract class.

Any class w/ an abstract method must be declared abstract. You have to override
the abstract method that was in the superclass.

Abstract classes can be subclasses of a "concrete" class.

Abstract method must be non-static, because if it were static, you would not 
be able to override the method.