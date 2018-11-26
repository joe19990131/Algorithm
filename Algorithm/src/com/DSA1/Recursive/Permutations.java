package com.DSA1.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	char tmp;
	char tmp2;

//將陣列target中的第amount號移動到頭
	public static <T> List<T> rotatedTo(int amount, List<T> target) {
		List<T> rotated = new ArrayList<>();
		rotated.add(target.get(amount));
		rotated.addAll(target.subList(0, amount));
		rotated.addAll(target.subList(amount + 1, target.size()));
		return rotated;
	}

//將每個元素都搬到頭一次
	public static <T> List<List<T>> allRotated(List<T> list) {
		List<List<T>> allRotated = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			allRotated.add(rotatedTo(i, list));
		}
		return allRotated;
	}

	public static <T> List<List<T>> perm(List<T> list) {
		List<List<T>> pls = new ArrayList<>();

		if (pls.isEmpty()) {
			pls.add(new ArrayList<T>());
		} else {
			for (List<T> lt : allRotated(list)) {
				for (List<T> tailPl : perm(lt.subList(1, lt.size()))) {
					List<T> pl = new ArrayList<>();
					pl.add(lt.get(0));
					pl.addAll(tailPl);
					pls.add(pl);
				}
			}
		}
		return pls;
	}

	public static void main(String[] args) {
		Permutations permutations = new Permutations();
		List<Integer> pl = new ArrayList<>();
		for(int i = 1;i<10;i++) {
			pl.add(i);
		}
			
		System.out.println(permutations.perm(pl));
		
	}
}