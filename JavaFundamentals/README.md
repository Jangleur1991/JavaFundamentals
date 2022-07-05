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

## Strings

Strings are immutable, which means that their state does not change after initialisation.
So any method you call on a String will not change the String. 
Instead, a completely new String is created.

Example:  
<code>String a = "a";</code>    
<code>a.concat("b");</code>    
<code>System.out.println(a); //Output: "a" </code> 

Why are Strings immutable?
You do not want to have side effects for strings.
Strings sometimes contain important information like user names. 

How to compare Strings?
You should always use the <em>equals</em>
method! For Strings a so called <em>String Pool</em> is used
which means a new String is only generated if necessary.

What this means can be seen in the following example:


<code>String s1 = "a";</code>  
<code>String s2 = "a";</code>


<code>System.out.println(s1==s2)  //True</code>

Only one String <code>"a"</code> is generated and used here.
That is the reason why <code>s1==s2</code> is true. 

But if you create a String on the Heap instead:

<code>String s3 = new String("a")</code>
<code>System.out.println(s1==s3) //false</code>
<code>System.out.println(s1.equals(s3)) //true</code>

So always use <em>equals</em> for Strings (and for Objects in general).


