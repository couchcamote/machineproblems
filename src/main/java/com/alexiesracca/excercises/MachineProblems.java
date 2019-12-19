package com.alexiesracca.excercises;

import com.alexiesracca.excercises.datastructures.BinaryTree;
import com.alexiesracca.excercises.datastructures.BreadthFirstTraversal;
import com.alexiesracca.excercises.datastructures.DepthFirstTraversal;
import com.alexiesracca.excercises.datastructures.DijkstraShortestPath;
import com.alexiesracca.excercises.datastructures.LinkedList;
import com.alexiesracca.excercises.datastructures.PrimMinimumSpanningTree;
import com.alexiesracca.excercises.datastructures.PriorityQueue;
import com.alexiesracca.excercises.datastructures.Queue;
import com.alexiesracca.excercises.datastructures.Stack;
import com.alexiesracca.excercises.datastructures.StackUsingArray;
import com.alexiesracca.excercises.numbers.ExtractDigits;
import com.alexiesracca.excercises.numbers.QuadrarticPolynomial;
import com.alexiesracca.excercises.numbers.RetainOddCount;
import com.alexiesracca.excercises.strings.ExtractCurrencyValue;
import com.alexiesracca.excercises.strings.Palindrome;
import com.alexiesracca.excercises.strings.ReverseString;
import com.alexiesracca.excercises.strings.SwapWithoutTemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MachineProblems {

	public static void main(String[] args) {
		SpringApplication.run(MachineProblems.class, args);

		//Data Strcutures
		LinkedList.test();
		Queue.test();
		Stack.test();
		StackUsingArray.test();
		PriorityQueue.test();
		BinaryTree.test();
		BreadthFirstTraversal.test();
		DepthFirstTraversal.test();
		DijkstraShortestPath.test();
		PrimMinimumSpanningTree.test();

		//Number Problems
		ExtractDigits.test();
		RetainOddCount.test();
		QuadrarticPolynomial.test();

		//String Operations
		Palindrome.test();
		ReverseString.test();
		SwapWithoutTemp.test();
		ExtractCurrencyValue.test();
	}

}
