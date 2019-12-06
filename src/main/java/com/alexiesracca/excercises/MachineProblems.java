package com.alexiesracca.excercises;

import com.alexiesracca.excercises.datastructures.BinaryTree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MachineProblems {

	public static void main(String[] args) {
		SpringApplication.run(MachineProblems.class, args);

		String x = "testtext";
		String y = "testtext";
		String z = new String("testtext");
		System.out.println("testtext" == x);
		System.out.println(y == x);
		System.out.println(z == x);

		BinaryTree.test();
	}

}
