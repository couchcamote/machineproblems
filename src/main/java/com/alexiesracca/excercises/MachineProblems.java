package com.alexiesracca.excercises;

import com.alexiesracca.excercises.datastructures.BinaryTree;
import com.alexiesracca.excercises.datastructures.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MachineProblems {

	public static void main(String[] args) {
		SpringApplication.run(MachineProblems.class, args);

		LinkedList.test();
		BinaryTree.test();
	}

}
