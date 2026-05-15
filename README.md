# Lab #6 - Recursive Maze Solving & Diversity in STEM

## Introduction
This week we are focusing on the role of **diversity in computing and STEM fields**, with a special emphasis on the **underrepresentation of African American women**. Although the number of women in STEM has increased over time, African American women continue to face unique challenges in entering and thriving in these fields.

In this lab, you will:
1.  **Write a recursive backtracking algorithm** to solve a maze in Java.
2.  **Test your program** to ensure it works correctly.
3.  **Reflect on diversity in STEM** by answering a set of questions.
4.  **Draw connections** between recursion and the ongoing efforts required to create a more inclusive and equitable STEM community.

## Learning Objectives
By completing this lab, you will:
*   Learn how recursion can be used to solve **backtracking problems**.
*   Gain experience working with **2D arrays** and recursive algorithms in Java.
*   Understand how recursion explores multiple possible paths toward a solution.
*   Think critically about how diversity contributes to innovation and problem-solving.
*   Reflect on the challenges African American women face in STEM careers.

## Part 1: Recursive Maze Solver in Java
In this part, you will **implement a recursive function to solve a maze**. The maze will be represented as a **2D array** of integers:
*   `0` means the cell is **open** (you can move there).
*   `1` means the cell is a **wall** (you cannot move there).

You start at the **top-left corner (0,0)** and try to reach the **bottom-right corner (n-1, n-1)**.

If a solution exists, your program should print a matrix (solution) that marks the path you took with `1`s.

### **Step 1: Create the Java Class**
*   Open your IDE.
*   Create a new file called `MazeSolver.java`.
*   Copy and paste the following starter code into it:

### **Step 2: Run the Program**
*   Compile and run your program.
*   You should see something like this (if a path is found):
```
Path found:
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 1
```
*   Try **changing the maze layout** to test different cases:
  *   Add more walls.
  *   Block the destination completely.
  *   Create a simple maze with only one possible path.

### **Step 3: Modify and Experiment**
*   Add more **maze sizes** (like 5x5 or 6x6).
*   Try to **print multiple paths** (optional challenge).
*   Add **comments** to explain how recursion is working at each step.
    
## Part 2: Reflection on Diversity in STEM
Answer the following questions in **5–7 sentences each**. You can type your answers in a separate Word/PDF document, or include them in your `MazeSolver.java` file as **multi-line comments** (`/* ... */`).
1.  **Diversity and Innovation**
  *   How does including African American women and other underrepresented groups in STEM contribute to creativity, innovation, and problem-solving?
2.  **Barriers and Challenges**
  *   What are some systemic and cultural barriers that African American women face when pursuing STEM education and careers?
3.  **Personal Action**
  *   What steps can _you_ take, as a future STEM professional, to support inclusivity, equity, and representation in your field?

## Part 3: The Recursive Connection
Write a **short essay (7–10 sentences)** answering the following:
*   Recursion involves **trying paths, backtracking when something doesn’t work, and persisting until a solution is found**.
*   In what ways does this process mirror the ongoing efforts to increase representation of African American women in STEM?
*   How can the idea of recursion (small steps that build toward a solution) be used as a metaphor for creating systemic change in education and careers?

## Deliverables
You must submit the following:
1.  **`MazeSolver.java` file** with your recursive maze solver program.
2.  **Reflection answers** (either in comments inside the Java file or as a separate document).
