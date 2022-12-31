# JavaCollections

This is the repo of examples and to learn JavaCollections
It are some data types:
- arrays
- ArrayList
- HashMap
- Map
- and many more

#Heap And Stack 
Before moving on lets learn about heap and stack.
**Whenever we declare new variables and objects, call a new method, declare a String, or perform similar operations, JVM designates memory to these operations from either Stack Memory or Heap Space.**
*Stacks are like books on your desk.And heap as the books in shelf.*
### Stack space
  ***The Stack memory is used by Java for the static memory allocation and execution of thread.***
  It contains the primitive value that are specific for method and refrences to objects.
  When we call a new Method, A new block is created in the top of the stack which contains value specific to that method, like primitive variables and refrence to that object.
  When the method finishes execution, its corresponding stack frame is flushed, the flow goes vack to the calling method, and space becomes available for next method.
  The stack memory grows or shrink as new methods are called and returned, repectively
  The variables created in them only exists as the method is running. This feature maked programs faster.
  This is threadsafe, as each thread oprates in its own stack.
  
### Heap space
  ***Heap space is used for the dynamic memory allocation of Java objects and JRE classes at runtime.***
  New Objects are always created in Heap.
  
## Arrays
Arrays is a inmutable data type.It can't be changed dynamically.
The data is stored in stack.

##ArraysList

