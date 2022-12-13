# M320 KO2

## Terms to be Elaborated

**Information hiding**: Information hiding is a software design principle. Where our clients are incapable to access few aspects
of our program and module. The reasoning for this is, so that we prevent extensive modification to clients when the implementation
details of a program/class/module are changed.



**Encapsulation**:  Encapsulation in Java refers to integrating variable and methods into a single unit.
Variables from a class are invalid/hidden from other classes. The only way of retrieving them, are by accessing them via
methods which lay within the class.


**Getter, Setter**:  Getters and setter are known and used to protect data They also are known
as accessors. Especially when creating classes.
Each instance a getter returns their value and the setter usually sets or updates its value(CRUD-Element impl).


**Delegation**: In OOP delegation refers to evaluating a method of an/one object with the understanding of another original object
which is the sender!

delegation refers to evaluating a member (property or method)
of one object (the receiver) in the context of another original object (the sender).

## Project & Implementation
**Themenbereich**: Terms being used

We used **Encapsulation** in the Agent class, where our fields are only accessible trough getting the methods implemented in the
Agent class.

We used **Delegation** so that we can use the getter and setter for the Agent class.

Agent and Menu has information hiding implemented.
