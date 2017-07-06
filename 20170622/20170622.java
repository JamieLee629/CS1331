(Exam does not cover Generics)
Anything you have programmed in the HW is fair game for the programming quiz. No lecture material
inheritance, polymorphism, casting, static variables
does not cover collections or generics.
does not cover exceptions.
Exam Thursday covers all of the above.
Know how to program classes, subclasses
Anything in pokemon homework.
Exam is the first half.

Chapter 19: Generics
Generics: the ability to parameterize types.
Error is more likely to be detected at compile time.
<T> means generic type
Compares to something of the same type.
For example:

package java.lang;
public interface Comparable<T> {
    public int compareTo(T o);
}

Generic method can work for any type object:

*Important test subjects: polymorphism, exceptions, Chapter 20

On the programming quiz, you may need to use the Java API

Collection vs Collections
ArrayList vs LinkedList

Comparators:
Different from Comparable in that Comparator compares 2 different types.
Comparator Interface:

e.g.
public int compare(Object element1, Object element2)

Collections is a static class (use this for homework)
contains static methods, such as binary search, max

Stacks and Queues
Stack - Cafeteria trays (the bottom ones dont always get used, because freshly clean 
    stack always gets added to the top) : common methods: push, pop, peek
stk.push(thing) <-- will place the thing on the top of the stack
stk.push(thing)
stk.pop(thing) <-- will take the top thing off (the most recent one added)

with a stack, you only have a pointer at the top.
Stack is a first in, last out data structure.

Queue is a first in, first out data structure. The first one in line is the first one to go.
New items are added to the end of the line. (for example, a movie theatre line)

Queue methods: offer, poll, remove, peek, element

Case Study: Evaluating Expressions
Stacks can be used to evaluate mathematical expressions.
When it gets to end parenthesis, it pops the stack:

(3 + 5 ) - 2
Stack:

(
3
+
5
)


