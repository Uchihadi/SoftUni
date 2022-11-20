package Methods.ValueReference;

public class ValueVSReference {
    // Stack vs Heap; Reference
    // Value type variables holds directly of their values (eg. int, float, double, char)
    // A variable of a value (primitive data) type contains an instance of the type and holds directly their value.
    // Primitive data types or value types contain the value of a variable directly inside their own memory location
    // With value types, each variable has its own copy of the data and it is not possible for operations on one variable to affect another.
    // When a value of a primitive type is assigned to another variable of the same type, a copy of the primitive type is made.
    // When a primitive type is passed to a method, only a copy of the primitive type is passed.
    // The called method does not have access to the original primitive value and therefore cannot change it.
    // The called method can change the copied value.
    // Primitive data types are: byte, short, int, long, float, double, boolean and char.
    int i = 42; //require 4 bytes of memory
    char ch = 'A'; //require 2 bytes of memory
    boolean result = true; //require 1 byte of memory

    // Reference Type variables hold a reference (pointer / memory address) of values
    // Two reference type var can reference same object
    // When an object is passed to a method, the called method can change the value of the object passed to it but not the address of the object.
    // Reference data types are: String, int[], char[], String[].
    String str = "Hello";
    byte[] bytes = { 1, 2, 3 };

    //primitives
    int num = 42;
    char letter = 'A';
    boolean isRunning = true;

    //reference type
    String string = "Hello";
    byte[] bytes1 ={ 1, 2, 3 };
}
