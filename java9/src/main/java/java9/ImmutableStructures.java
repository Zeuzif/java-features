package java9;

import java.util.Map;
import java.util.Set;

public class ImmutableStructures {

	public static void main(String[] args) {
		System.out.println("--------set--------");
		Set<Integer> set = Set.of(1, 2, 3);
		set.forEach(ImmutableStructures::printWithSpace);

		System.out.println();
		System.out.println("--------map--------");
		Map<Integer, String> map = Map.of(1, "one", 2, "two");
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}

	private static void printWithSpace(Object x) {
		System.out.print(x + " ");
	}

}
