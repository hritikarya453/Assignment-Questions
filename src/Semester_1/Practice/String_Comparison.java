package Semester_1.Practice;

public class String_Comparison {
    static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);   // false (different objects) // object ka jo refrence hai usko compare kr rha
       // This happens because int is a primitive data type, and for primitive types == compares values, not references.

    }
}
