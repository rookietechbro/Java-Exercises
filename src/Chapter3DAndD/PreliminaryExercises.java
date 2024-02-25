package Chapter3DAndD;

/*
 * 3.1 Fill in the blanks (which are in brackets) in each of the following:
 * a) Each class declaration that begins with keyword (public) must be stored in a file that has exactly the same name
 as the class and ends with the .java filename extension.
 * b) Keyword (class) in a class declaration is followed immediately by the class’s name.
 * c) Keyword (new) requests memory from the system to store an object, then calls the corresponding class’s constructor to initialize the object.
 * d) Each parameter must specify both a(n)(datatype) and a(n)(identifier) .
 * e) By default, classes that are compiled in the same directory are considered to be in the same package, known as
 the (default package).
 * f) Java provides two primitive types for storing floating-point numbers in memory: (double)
 and (float).
 * g) Variables of type double represent (double-precision) floating-point numbers.
 * h) Scanner method (nextDouble) returns a double value.
 * i) Keyword public is an access (modifier) .
 * j) Return type (void) indicates that a method will not return a value.
 * k) Scanner method (nextLine) reads characters until it encounters a newline character, then returns those characters
as a String.
 * l) Class String is in package (java.lang.util).
 * m) A(n) (import) is not required if you always refer to a class with its fully qualified class name.
 * n) A(n) (floating-point number) is a number with a decimal point, such as 7.33, 0.0975 or 1000.12345.
 * o) Variables of type float represent (single) -precision floating-point numbers.
 * p) The format specifier (%d) is used to output values of type float or double.
 * q) Types in Java are divided into two categories—(primitive) types and ()reference) types.


 * 3.2 State whether each of the following is true or false. If false, explain why.
 * a) By convention, method names begin with an uppercase first letter, and all subsequent
 * words in the name begin with a capital first letter. (False. According to Java convention, the first word for methods
 should start with lowercase letters and then subsequent words should start with uppercase letters.)
 * b) An import declaration is not required when one class in a package uses another in the
 same package.(True)
 * c) Empty parentheses following a method name in a method declaration indicate that the
 method does not require any parameters to perform its task.(True)
 * d) A primitive-type variable can be used to invoke a method.(False. Only reference-type variables can be used to
 invoke a method.)
 * e) Variables declared in the body of a particular method are known as instance variables and can be used in all
 methods of the class.(False. They are known as local variables because they are declared inside a method and they
 can't be accessed by other methods of even the same class.)
 * f) Every method’s body is delimited by left and right braces ({ and }).(True)
 * g) Primitive-type local variables are initialized by default.(False. Primitive-type variables have to be explicitly
 initialized if not a compiler error will occur.)
 * h) Reference-type instance variables are initialized by default to the value null. (True)
 * i) Any class that contains public static void main(String[] args) can be used to execute an app. (True)
 * j) The number of arguments in the method call must match the number of parameters in the method declaration’s
 parameter list.(True)
 * k) Floating-point values that appear in source code are known as floating-point literals and
 are type float by default.


3.3 What is the difference between a local variable and an instance variable?
 A local variable is declared within the method of a class, its scope starts and ends within the method after which
 its values are lost and it cannot be used by other methods in the class. While an instance variable is an attribute of
 the class, so, it is declared before any method of the class is declared and it can be accessed by all methods of the
 class in which it is declared.


3.4 Explain the purpose of a method parameter. What is the difference between a parameter and an argument?
 A method parameter is used to declare the datatype and name of the variables a method needs to perform its tasks. The
 difference between a parameter and an argument is while parameters specify data types and names of variables it needs
 to perform its tasks, arguments are the actual values of those parameters, to be supplied by the user.


3.5 (Keyword new) What’s the purpose of keyword new? Explain what happens when you use it.
The keyword 'new' is used when creating a new object. It first tells the system to create a space in memory to store the new
object that's being created. Then it tells the corresponding constructor to initialize the object.


3.6 (Default Constructors) A class declares a constructor that takes two parameters. How would
you create an instance of the class with no parameters?
Let's say the class name is Sky.
An instance of the class with no parameter will be:
Sky sky = new Sky();


3.7 (Instance Variables) Explain the purpose of an instance variable.
The purpose of an instance variable is for information hiding. Since they are mostly private, instance variables can
 only be accessed and manipulated by the methods of the class that they are declared in.


3.8 (Using Classes without Importing Them) Most classes need to be imported before they can
be used in an app. Why is every app allowed to use classes System and String without first importing
them?
Because they are contained in the java.lang.* package which is available implicitly to every class created in Java.

3.9 (Using a Class without Importing It) Explain how a program could use class Scanner without importing it.
By calling its library and package name i.e
java.util.Scanner scanner = new java.util.Scanner(System.in);


3.10 (set and get Methods) Explain the disadvantage of creating a class that has no set and get
methods for an instance variable.
The instance variables of that class would always be same because they can't be accessed nor manipulated.

 */
public class PreliminaryExercises {

    public static void main(String[] args) {

    }
}
