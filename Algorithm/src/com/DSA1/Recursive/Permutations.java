package com.DSA1.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	char tmp;
	char tmp2;

	public <T> List<T> moveFirst(int amount, List<T> target) {
			List<T> rotated = new ArrayList<>();
			rotated.add(target.get(amount));
			rotated.addAll(target.subList(0, amount));
	        rotated.addAll(target.subList(amount + 1, target.size()));
	        return rotated;
	}
	public static void main(String[] args) {
		Permutations p1 = new Permutations();
		System.out.println(p1.moveFirst(2,Arrays.asList(1,2,3,4,5,6,7)));
	}
}
