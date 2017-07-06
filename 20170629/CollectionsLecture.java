Iterable is an INTERFACE

ArrayList<> tasks = new ArrayList<>();
Iterator<> iterator = tasks.iterator();

now you can call the iterator methods on iterator.

Iterator Methods:
hasNext()
next()
remove()

Homework 5: Need to use iterator for collection
*Understand Iterators

Comparators:

Advantage for using Comparable is that we can use the collections.sort() method.

We use comparators when you are not allowed to implement the comparable interface (for
    instance, when using a library class or someone else's class)

Collections API
Where it is stored: java.util.Collections
import java.util.Collections

You cannot sort an array of types which do not implement the comparable interface. If 
you try, then you will get a compile error.
So you need to use:

Collections.sort(list, comparator);

So we create a comparator to make up for the fact that the objects in our list do not 
come from a class that implements comparable.