# Java Practice 

1. Clone this repository using `git clone git@github.com:casian-rinf/java-course.git`
1. Create a separate branch from `develop` branch:
   - `git checkout develop`
   - `git checkout -b name-of-your-branch`
2. Solve the exercise
3. Push the changes using `git push origin name-of-your-branch`
4. Create a pull request to `develop`

## Problems

1. Write a Java method that computes the sum of an integer's digits
   - Input: 8733
   - Result: 21
   
 
2. Write a Java method that counts the letters, spaces and numbers in an input string.
   - Input: "The quick brown fox jumps over 42 lazy dogs"
   - Output: Letter: 33, Spaces: 8, Numbers: 2

   
3. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.


4. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.


5. Write a Java program to find common elements between two arrays (string values).
   - Input:
     - firstArray: { "Python", "Java", "GoLang", "Lisp" }
     - secondArray: { "Java", "C++", "Apples", "Hamburger", "Lisp" } 
   - Result: {"Java", "Lisp"}
            

6. Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.


7.  Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.


8. Write a Java program that swaps two elements in an array list.
   - Input: { "Red", "Green", "Black", "White", "Pink" }, 1, 4
   - Output: { "Red", "Pink", "Black", "White",  "Green" }


9. Write a Java program to get the first and last occurrence of the specified element in a list.
   - Input: { "Red", "Green", "Black", "White", "Pink", "Green", "Green", "Black", "Yellow", "White"}, "Green"
   - Output: First occurrence for Green is position 1 and last is position 6


10. Given an array of strings, group anagrams together using a map
    - Input: {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist", "hello", "world", "dlrow"}