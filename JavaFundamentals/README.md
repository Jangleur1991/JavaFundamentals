# Java Fundamentals

This a collection of Java topics covered in Cay S. Horstmann's
<em>Core Java SE9 for the Impatient</em>.


## The JShell

The JShell is a REPL (read-evaluate-print loop).
You type an expression, JShell evaluates it, print it and wait again for your input.

How to start? Type "jshell" in your CLI.

You do not need to use System.out.println in a REPL. Just write e.g. "Hello World".length().

Example:  
Input: 11  
Output: $1 ==> 11

You can use <em>$1</em> in further calculations. It is
just a variable with value <em>11</em> in this case.

Example:   
Input: 3+$1   
Output: $2 ==> 14

Important commands:
<ul>
    <li>Assign expression to a variable: Shift+Tab and then V! 
        Example: new Random(). Then you get Random = new Random.
        Now you can write the name of the variable.</li>
    <li>Close JShell: Strg+D</li>
    <li>Tab completion: Tab</li>
    <li>If a class is not present (because import is missing). 
        Write the class name and then Shift+Tab and then I.     
        Example: Duration Shift+Tab and then I.</li>
</ul>
