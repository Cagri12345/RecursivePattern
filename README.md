# Recursive Pattern Project

This project demonstrates how to create a number pattern using recursion in Java, based on a specific rule.

## Project Description

The program prompts the user to enter a number `n`. It then generates a pattern by recursively subtracting 5 from the number until it becomes zero or negative. Once the number reaches zero or a negative value, the program starts adding 5 back to the number until it returns to the original value.

## How It Works

1. **decreasePattern Method**: 
   - This method subtracts 5 from the number until it becomes zero or negative.
   - It then calls the `increasePattern` method to start adding 5 back.

2. **increasePattern Method**: 
   - This method adds 5 to the number until it returns to the original value.

3. **Main Method**:
   - The main method gets user input and initiates the pattern generation by calling the `decreasePattern` method.
