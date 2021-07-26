/* 	
	Name: StackFromList
	Author: Kameron Fincher
	Description: Demonstrates stack use
	I.E. Command: java StackFromList
	Compile with: javac StackFromList.java CustomStack.java
	
	Instructions:
		Problem 2: Write a program and show how to implement stack using Linked List in java.(note: implement your own linked list or use the one provided by java)
*/
import java.util.*;

class StackFromList{
	public static void main(String[] args){
		
		CustomStack StackList = new CustomStack();

		StackList.push(0);
		StackList.push(1);
		StackList.push(2);
		StackList.push(3);
		StackList.push(4);
		
		// 4, 3, 2, 1, 0
		StackList.print();
		
		// 4
		System.out.println(StackList.peek());
		
		StackList.pop();
		StackList.pop();
		
		// 2, 1, 0
		StackList.print();
		
		StackList.push(3);
		StackList.push(4);
		
		StackList.pop(2);
		
		// 2, 1, 0
		StackList.print();
		
	}	
}