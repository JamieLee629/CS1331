Collections:

Collection interface vs Collections class

Collection<E> //The <E> has to do with generics

*Lists, ArrayLists
Lists: Interface that extends the collection interface.

A list has all the methods defined in the API.

set: You cannot add a duplicate element to.

Interfaces can extend other interfaces. Add all the methods that it needs to have.

List extends Collections, so List needs to override all abstract methods in Collections.

Collections all extend interable, meaning you can use it in a for each loop.

Collections as a class: has a lot of static methods you can use.
Collections.method();


ArrayLists

Generics:
Useful so we don't have to keep rewriting methods.
Student --> person.
We can make an ArrayList that works for both student class and person class.
You don't have to make new methods to work for each class.


This is what the Generic ArrayList class looks like:
public class ArrayList<E> {

}

Because the header looks like this, we can have ArrayList work with any object.
If <E> was not there, we would have to make an ArrayList class specialized for
every object.

*You cannot use generics with primitive types! Only objects. You can use Integer,
but not int.

fun fact: You can have as many things as you want between the angle brackets.
You don't need to know about Maps on the test.

Overview of wildcards:
wildcard = ?

What a wildcard does:
<? super T> means whatevers in the angle bracket can be T or anything super to T
(any of T's parent class).

<T extends Comparable<? super T>>
T is Comparable (because it extends comparable) and the comparable object that goes
in the parameter

in the java api:
public static <T extends Comparable<? super T>> void sort(List<T> a) {
    //...
    //On the next homework!
}

You can do this: <?> but it is not recommended. Not type-safe!

Say you have
<? extends T>

Classes can also be generic. Classes can also use generics (they can have type parameters).

if you do not specify any class requiring a type parameter <E>, it will error

public class ArrayList<E> {

}

E some = new E(); //Not valid
E some = (E)(new Object()); You cannot make generic type things.

For example,
You cannot:
E[] arr = new E[10];
You have to:
E[] arr = (E[]) new Object[10];

you have to be sure that the objects are comparable if you need so.

E[] arr = (E[]) new Comparable[10];

Comparable[] a = new Comparable[10]; //Then cast to E[] after. e.g.:
return (T)a[4]; //REMEMBER THIS FOR THE HOMEWORK