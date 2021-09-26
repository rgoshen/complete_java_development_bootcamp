# Cheat Sheet
This cheat sheet contains the most important takeaways that lead up to section one.

## Table of Contents

1. [Getting Started](getting-started)
2. [Variables](variables)
3. [Booleans and Conditionals](#booleans-and-conditionals)
4. [Functions](#functions)
5. [Loops](#loops)
6. [Arrays](#arrays)
7. [The World of Objects](#the-world-of-objects)

- [Scanner](#scanner)
- [Rules of thumb](#rules-of-thumb)
- [Good Coding Habits](#good-coding-habits)
- [Tips and Tricks](#tips-and-tricks)

## Getting Started

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

## The World of Objects
### Definitions
- **Class**: blueprint from which you can create objects.
- **Object**: an object in a *thing* that you can see or describe.
- **Field**: class variable that describes an object.
- **Action**: method (function) that represents what the object can do.
- **Constructor**: runs when you create a `new` object.
	- Purpose: update every field of the newly created object.
- **this**: refers to teh current object that's calling the constructor or method.
	- Purpose: useful when fields and parameters have conflicting names.
- **Copy Constructor**: runs when you create an object.
	- Purpose: copy every value from a `source` object into a `new` object
- **Getter**: method (function) that returns a copy of a `private` field's value.
- **Setter**: method that updates the value of a `private` field.
- **toString**: method that returns a `String` representation of every field in an object.
	- Purpose: when you print an object, Java internally call the `toString` method.

### `publc` **VS.** `private`
- `public`: provides public access to a field or method from anywhere.
	- Constructors and methods tend to be `public`.
- `private`: prevents direct access of a field or method outside of the class.
	- To protect the state of an object, fields tend to be `private`.

### The Big Three
If a `class` has fields, you need to add:

1. **Constructor** -- to update the fields of a `new` object.
2. **Getters** -- to get the value of a `private` field.
3. **Setters** -- to set the value of a `private` field.

### Reference Traps
```java
The state of a variable should not change because you updated another.
```
|||
|:--:|:--:|
| <span style="color:white; background-color:black;">Trap</span> | Setting an array equal to another. |
| <span style="color:white; background-color:black;">Pitfall</span> | Both variables share a reference to the same array. |
| <span style="color:white; background-color:black;">Solution</span> | Set it equal to a copy of the array (Arrays.copyOf). |
|||
| <span style="color:white; background-color:black;">Trap 2 </span> | Setting an object variable equal to another. |
| <span style="color:white; background-color:black;">Pitfall</span> | Both variables share a reference to the same object. |
| <span style="color:white; background-color:black;">Solution</span> | Create a new copy of the object (copy constructor). |
|||
| <span style="color:white; background-color:black;">Trap 3</span> | Getter returns an array field directly. |
| <span style="color:white; background-color:black;">Pitfall</span> | The outside variable and field share a reference to the same array. |
| <span style="color:white; background-color:black;">Solution</span> | Set it equal to a copy of the array (Arrays.copyOf). |
|||
| <span style="color:white; background-color:black;">Trap 4</span> | Getter returns a object directly. |
| <span style="color:white; background-color:black;">Pitfall</span> | The outside variable and field share a reference to the same object. |
| <span style="color:white; background-color:black;">Solution</span> | Return a new copyof the object. |
|||

Falling into a reference trap can:

1. lead to unpredictable behavior.
2. lead to variables changing when you don't expect them to.
3. leave you wondering: *why is my coding doing this?*

### Primative vs. Class Types

| <span style="color:white; background-color:black;">Primative Type</span> | <span style="color:white; background-color:black;">Class Type</span> |
| :---: | :---: |
| Stores a value | Stores a reference |
| Cannot be null | Can be null |   
| Has no methods | Has methods |

Examples of primatives types are `int`, `long`, `char`, and `boolean`.
Examples of class types that we created objects from are: `Scanner`, `Dealership`, `Car`.

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

- return an array on the fly using:

```java
return Type[] { element1, element2 };
```

#### OOP

- Syntax to directly pass an array into a method: `new String[] { element, element }`
- Syntax to directly return an array: `return new String[] { element, element }`
- You can autocomplete getters adn setters in Visual Studio Code.
![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fc2195e80-49e4-4d1d-9662-3c838f89b5f1?alt=media&token=0bcb836d-0d2a-4ef0-bb7c-219904911328)



