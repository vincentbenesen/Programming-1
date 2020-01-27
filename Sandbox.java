/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

public class Sandbox {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println(" \n Hello, World, this is my sandbox program");

       final double PI = 3.14159;

        double radius = 3.5;
        double area;

         area = PI * radius * radius;


          System.out.println( "The area of the circle is " + area );
    }

}
