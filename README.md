# Java concept clearfication
## Overload VS Override 
** Method Overloading** can be defined as a feature in which a class can have more than one method having the same name if and only if they differ by number of parameters or the type of parameters or both, then they may or may not have same return type. Method overloading is one of the ways that java support Polymorphism.
**Overriding** is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
[MoreInfo](https://www.geeksforgeeks.org/overriding-in-java/)

@Override annotation is used when a developer overrides a function in Java to use the same function name but assign these functions with different properties.

**Example #1**
An example to demonstrate the working of override annotation.

[MoreInfo](https://www.educba.com/java-override/)

```c 
// This is Base class
class Pclass {
void printfunction()
{
System.out.println("This is the output of function present in parent class \"Pclass\". ");
}
}
// This is Child class
class Cclass extends Pclass {
// The below function is override function along with override annotation
@Override
void printfunction()
{
System.out.println("This is the output of function present in child class \"Cclass\".");
}
}
// Thi is Main class from here the contro; execution starts. JAVA compiler searches for main class to start executing any code.
public class Main {
public static void main(String[] args)
{
Pclass object1 = new Pclass();
object1.printfunction();
Pclass object2 = new Cclass();
object2.printfunction();
}
}
```
### instance
The variables that are declared inside the class but outside the scope of any method are called instance variables in Java. The instance variable is initialized at the time of the class loading or when an object of the class is created. When we create an object, this object can call instances using eg: `Class c= new Class(); c.instance;` and method `c.method()`. Thats what getters and setters mean, using methods to update the instances. 
###Static 
Static methods are designed with the aim to be shared among all objects created from the same class.  Static methods are the methods in Java that can be called without creating an object of class. Let all the methods know they can grab it like global varibles. Can understand it as static on the top. 
### Static vs final
[MoreInfo](https://pediaa.com/what-is-the-difference-between-static-and-final/#:~:text=The%20main%20difference%20between%20static%20and%20final%20is,overridden%20or%20a%20class%20that%20cannot%20be%20inherited.)
### Arraylist<> 
Pass class in Arraylist 
### Interface
### Lamad function
### super()
[MoreInfo](https://www.geeksforgeeks.org/difference-between-super-and-super-in-java-with-examples/#:~:text=super-,super(),call%20parent%20class'%20constructors%20only.)