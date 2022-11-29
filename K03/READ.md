# M320 KO3

## Terms to be Elaborated

**Exception Class**: The exception class are a way or form of throwable that detects conditions that an application might want to catch. The class Exception and subclasses that are of an RunTimeException are checked exceptions.
Checked exceptions need to be declared in a method or constructor’s throws clause so that it can be thrown and executed in a method so it can propagate can be outside the method or the constructors boundary.



**So what are unchecked exceptions?**:  Unchecked exceptions are known as an runtime exception in Java and it explains the something has gone wrong with the program and is unrecoverable. Its not a compile time exception so you don’t need to handle it, but be beware you do need to be concerned about is.



**Exceptions:**:  An exception is is an abnormal condition that occurs in a code sequence during the execution of a program. This  abnormal condition arises when a programm disturbed a certain constrains at runtime
All exception types are subclasses of the classException. This class is then subclassed into checked exceptions and unchecked exceptions. We'll consider them in detail in the subsequent sections.


**Compile time exceptions**: Are also known as checked exceptions because it happens as its compiling hence why compile time exception. They are checked by the compiler

**Run time exception**:
RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
RuntimeException and its subclasses are unchecked exceptions. Unchecked exceptions do not need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.





**throws**:
instead of us using try-catch on repeat, you have the possibility to throw the exception into detail(further), 
it is done with the keyword throws. In this instance it, the next higher instance is used to handle the exception.
The instruction is usually in the constructor or sometimes in the method itself. So if you do not want try-catch handling,
this allows you to use another method.


**throw**:
With throw you can throw an exception with your own will. To be able to do this you need to create an exception object,
and throw it with the KEYWORD:throw.


**try-catch-finally**:
Java try-catch-finally

try statement: The try statment allows you to define a block of code to be tested for errors during its execution.

catch statement: With the catch statement it helps/allows you to define a sequence of code to be executed, incase of an error
occures in the try block.

finally statement: Now with the finally statement, it lets you exceute code, with the syntax of try..catch..finally and lets
you execute code regardless of the result.












