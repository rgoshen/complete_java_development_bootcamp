# Cheat Sheet

## Table of Contents

1. [Getting Started](getting-started)
2. [Variables](variables)
3. [Booleans and Conditionals](#booleans-and-conditionals)
4. [Functions](#functions)
5. [Loops](#loops)
6. [Arrays](#arrays)

- [Scanner](#scanner)
- [Rules of thumb](#rules-of-thumb)
- [Good Coding Habits](#good-coding-habits)
- [Tips and Tricks](#tips-and-tricks)

## Getting Started

This cheat sheet contains the most important takeaways that lead up to section one.

- `class`: contain all your code
- `main()`: entry point of your app
- `javac <FileName>.java`: compiles your code
- `java <FileName>`: runs the compiled code

## Variables
### Data Types
There are 6 main data types

| Data Type | Value |
| :---: | :---: |
| int | Whole numbers |
| long | Very large whole numbers |   
| double | Decimals |
| String | Text |
| char | A single character |
| <span style="background-color:yellow">boolean</span> | <span style="background-color:yellow">true or false</span> |

`long` can store very big numbers.  But, `int` is faster and takes less memory.

| Variable Type | Amount of Memory (Bytes) | Valid Range of Values |
| :---: |     :---: | :---: |
| int | 4 | From: -2147483648 To: 2147483647 |
| long | 8 | From: -92233720368854775808 To: 92233720368854775807 |

### Math Operators

| Operator | Operator Name | Operator Function |
| :---: | :---: | :---: |
| + | PLUS | Adds numbers and strings together |
| - | MINUS | Subtract numbers |
| * | MULTIPLICATION | Multiplies numbers |
| / | DIVISION | Divides numbers |
| % | MODULUS | Returns the remainder of a division|
| ++ | ADD ONE | Increases a value by 1 |
| -- | SUBTRACT ONE | Decreases a value by 1 |
| += | ADD BY | Increases the value by the number on the right |
| -= | SUBTRACT BY | Decreases the value by the number on the right |

Put math operations in brackets if you wish to embed them inside a `String`.

- Example: `"5 + 2 is " + (5 + 2);`

## Booleans and Conditionals
### Comparison Operators

| Comparison | Comparison Name |
| :---: | :---: |
| > | greater than |
| < | less than |   
| >= | greter than equal to |
| <= | less than equal to |
| == | equal to |
| != | not equal to |
| equals | equal to (String) |
| !equals | not equal to (String) |

Put comparison operations in brackets if you wish to embed them inside a `String`.

- Example: `"Five is not smaller than one. I'm certain this is " + (5 < 1);`

## Functions
### Function Parts

1. **Level of access**: `private`, `public`.
2. **Return type**: `double`,`int`, `boolean`, `char`, `String`, `long`.
3. **Function name**: `lowerCamelCase (singChorus, kickBall)`.
4. **Parameter**: value received by the function.
5. **Argument**: value passed into the function.
6. **Code**: performs your task.

- `return` breaks the entire function. Nothing after it can run.

## Loops
- Use `for` loops when you know in advance how many times your code should run.
- Use `while` loops to keep running code while a condition is `true`.

`break`: breaks a loop and stops it from running.
`continue`: skips the current run, and continues the next one.

## Arrays
### Defining an array
You can define an array and its values in one line.

```java
Type[] array = { element1, element2, element3 };
```
You can also define the length of the array and populate it later.

```java
Type[] array = new Type[3];
array[0] = element1;
array[1] = element2;
array[3] = element3;
```
In both cases:

 - The variable does not store the array directly.
 - It stores a **reference** that points to it.

### Accessing values from an array
You can access values from an array by referring to its index, such that:

 - The first index is 0.
 - The last index is one less than the length of the array.
### Looping an array

```java
for (int i = 0; i < array.length; i++) {
	
}
```

### Reference Trap

|||
|:--:|:--:|
| <span style="color:white; background-color:black;">Trap</span> | Setting an array variable equal to another. |
| <span style="color:white; background-color:black;">Pitfall</span> | Both variables point to the same array. |
| <span style="color:white; background-color:black;">Solution</span> | Set it equal to a copy of the array (```Arrays.copyOf```). |
|||

### Defining a 2D array
Method 1:

```java
Type[][] array = {
	{element1, element2},
	{element3, element4}
};
```

Method 2:

```java
Type[][] array = new Type[2][2];
array[0][0] = element1;
array[0][1] = element2;
array[1][0] = element3;
array[1][1] = element4;
```
### Accessing values from a 2D array
 - The first bracket indexes the row.
 - The second bracket indexes teh element in that row.

### Looping a 2D array
```java
for(int i = 0; i < array.length; i++) {
	for(int j = 0; j < array[i].length; j++) {
	
	} 
}
```

### Scanner

| Method | Skips delimiter? | Returns |
| :--: | :--: | :--: |
| nextLine() | No | the next line |
| nextDouble() | Yes | the next double|
| nextInt() | yes | the next int |
| nextLong() | Yes | the next long |
| next() | Yes | the next String |

**The default delimiter is white space.

#### Scanner Pitfalls
|||
|:--:|:--:|
| <span style="color:white; background-color:blue;">Trap</span> | Putting nextLine() ahead of nextInt(), nextDouble(), nextLong(), or next(). |
| <span style="color:white; background-color:blue;">Pitfall</span> | nextLine() is wasted by reading an empty line. |
| <span style="color:white; background-color:blue;">Solution</span> | add a throwaway nextLine() before the real nextLine(). |
|||

### Rules of Thumb
When controlling how your code runs:

- use `switch` to compare one value against a list of values.
- in any other scenario, use `if-else`.  

Do not confuse `=` with `==`

- use `=` to set a value equal to another.
- use `==` to compare two values and return a boolean.

If a function calculates a value, return it.

### Good Coding Habits
#### Conventions

- class: `CamelCase`.
- variable: `lowerCamelCase`.
- function: `lowerCamelCase`.

### Tips and Tricks
#### Terminal

- Use the **up** arrow key to run previous terminal commands
- Press the `tab` key to autocomplete
- Type `clear` to clear the terminal output

#### Escape characters

- `\n` adds a new line of space.
- `\t` adds a new tab of space.

#### Shortcut Keys

- Use `CMD/Ctrl`+`/` to comment a highligted piece of code.
- In Visual Studio Code, use `sysout` as a shortcut to `System.out.println()`.
- Use `Ctrl/control` + `c` to interrupt the terminal output.
- Highlight and press `tab` for right indentation.
- Highlight and press `shift` + `tab` for left indentation.

#### Arrays

- return an array on teh fly using:

```java
return Type[] { element1, element2 };
```


