# Java Challenges

This project contains **Java** challenges extracted from [HackerRank](https://www.hackerrank.com/domains/java) focus on help you to improve your programming skills.

[README.md](../../README.md#how-to-read-input-from-the-console)

## How to read input from the console

Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

````java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
````
The code above creates a Scanner object named **scanner** and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:
````java
Hi 5
````
Our code will print:
````java
myString is: Hi
myInt is: 5
````
Alternatively, you can use the BufferedReader class.

**Task**
In this challenge, you must read **3** integers from stdin and then print them to stdout. Each integer must be printed on a new line.

**Input Format**

There are **3** lines of input, and each line contains a single integer.

**Sample Input**
````java
42
100
125
````
**Sample Output**
````java
42
100
125
````

### [Solved](../../src/main/java/com/prottonne/challenges/StdInOutReader.java)