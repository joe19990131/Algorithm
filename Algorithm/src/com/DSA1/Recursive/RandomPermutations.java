package com.DSA1.Recursive;

import java.util.*;
import java.util.Random;

public class RandomPermutations {
	Random random = new Random();
	int tmp = 0;
	List<Integer> target = new ArrayList<>();

	public void generate() {
		for (int i = 1; i <= 20; i++) {
			target.add(i);
		}
	}

	public void sort() {
		for (int i = 0; i < target.size(); i++) {
			int r = random.nextInt(target.size() - 1);
			tmp = target.get(i);
			target.set(i, target.get(r));
			target.set(r, tmp);
		}
	}

	public static void main(String[] args) {
		RandomPermutations randomPermutations = new RandomPermutations();
		randomPermutations.generate();
		for (int i = 0; i < randomPermutations.target.size(); i++) {
			System.out.print(randomPermutations.target.get(i) + "  ");
		}
		System.out.println("");
		randomPermutations.sort();
		for (int i = 0; i < randomPermutations.target.size(); i++) {
			System.out.print(randomPermutations.target.get(i) + "  ");
		}
	}
}
