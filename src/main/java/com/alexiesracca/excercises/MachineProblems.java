package com.alexiesracca.excercises;

import com.alexiesracca.excercises.datastructures.BinaryTree;
import com.alexiesracca.excercises.datastructures.LinkedList;
import com.alexiesracca.excercises.datastructures.PriorityQueue;
import com.alexiesracca.excercises.datastructures.Queue;
import com.alexiesracca.excercises.datastructures.Stack;
import com.alexiesracca.excercises.datastructures.StackUsingArray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MachineProblems {

	public static void main(String[] args) {
		SpringApplication.run(MachineProblems.class, args);

		LinkedList.test();
		Queue.test();
		Stack.test();
		StackUsingArray.test();
		BinaryTree.test();
		PriorityQueue.test();
	}

}
