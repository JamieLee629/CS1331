Announcements
Recursion may be on programming quiz
Know how to implement data structures
implement hash code

Final Exam 11:30-14:20
Wednesday 2017-08-02
Early Option: Friday before exam week

Agenda
Review over what happened in test
HashCodes
Maps and Sets

HASHED COLLECTIONS AND HASH CODES
Well-behaved elements = "well written code"

If you made a new class on your own:
implement Comparable<T>
override equals AND hashcode.

If you don't override hashcode, you cannot use sets.
Some methods use hashcodes to determine whether an item is the same
or not as another (in lieu of the equals method).

Hashcode uses default same memory location (the memory location itself)
to compare items.

public int hashCode() {}

The hashcode should be the same for two objects if those two objects
are "equal". If two objects return true after the .equals method is
run on them, they should also have the same hashcode.

Know brief overview of hashTable.
HashFunction

You can use the hashcode method on strings to produce a hashcode,
but for other values, you want to use the hashCode "recipe" in the slides.

If you dont override hashcode, the contains method wont work right.

CheckPoints
21.2.6 - TRICKY!
21.2.7

Writing a data structure and implementing. All data structures are implemented
by using the basic array (not ArrayList).
You will need to write your own implementations of data structures to make things
efficient. Efficient as possible: Speed maximization and space minimization.

Map is like a Python Dictionary. Takes a key and a value. Key must be unique. The
key uses the hashCode to find the key in the set of keys.

No duplicates in the set of Keys. Order is not tracked in Map.

CheckPoints
21.2.3
21.3.1 - HashSet
Data structures you need to Know
**sets, lists, maps, stacks, queues.** KNOW WHEN TO USE!

21.3.2
21.3.4 Array is more efficient than arrayList b/c it does not have to automatically
handle resizing, etc.

tracing in ch 21.
Next Lecture: Implementing the data structures