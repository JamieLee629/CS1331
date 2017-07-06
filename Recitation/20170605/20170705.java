Comparable
"Natural Ordering"

Comparator is a functional interface.
Comparable implements compareTo method.
Comparator implements the compare method.

Overloaded collections.sort method that takes in a list and a comparator object.
You have to pass in an instance of the comparator.

Map is another interface entirely. It is not a Collection.
Maps define a relationship between keys and values.
Map cannot contain duplicate keys!

Duplicate key put will result in overriding the original value.

inner classes will have access to private variables.
inner class is usually private and declared inside of another class.
in homework, you'll need to use a private inner class to use the iterator.

In main method, or tester class, you cannot access a private inner class.
You'd have to reach it via the public outer class.

Iterable is an interface that allows you to use a foreach loop.
Anything that has an iterator you can put into a foreach loop.

Iterable<T>
    Iterator<T> iterator(); //METHOD

An iterator has to have 2 methods and one optional remove method. It needs to have
a public boolean hasNext() method and a public T next() method. The removed method
has a default implementation (public void remove();). All of these methods are
abstract.

iterable and iterator are both interfaces

List:
1 2 3 4 5

if a class implements Iterable<T>, then you'd have to do an inner class for Iterable<T>
You have to implement the next and hasNext methods yourself.
public class MyIterator implements Iterable<T> {
    public Iterator<T> iterator() {

    }
    private PersonIterator implements Iterator<T> {
        public boolean hasNext() {}
        public T next() {}
    }
}


"Override equals, but did not override hashcode" error

Whenever you override equals, you have to override hashcode.
Each object is associated to an integer.

@Override
public int hashCode() {
    return 1; //Simple example
}

If two objects are equal (according to the .equals method), then the hashCode integer of both
of those objects must be equal as well. If they are equal means they will be considered equal,
but they might not actually be equal.

Another place where hashCode might be used is a hashSet.

If you don't have a hashCode, you might run into problems.

The object's memory location address is related to the hashCode.

The objects hashCode method is based on the memory address. It will match values to hashCodes
based on memory location codes. If we do not override the default object hashCode method,
it will match objects to hashCodes based on memory locations. Two objects that *we* want to be
equal may not have equal hashCodes if the memory locations of the objects are different. If we
override the default Object hashCode method, then we can program the program to assign different
hashCodes based on our definition of equality that we defined in the .equals method.
