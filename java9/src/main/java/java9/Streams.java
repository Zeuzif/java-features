package java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> takeWhile = Stream.of(2, 4, 6, 7, 6, 10)
				.takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(takeWhile);

		List<Integer> dropWhile = Stream.of(1, 3, 4, 5, 6, 10)
				.dropWhile(i -> i % 2 == 1).collect(Collectors.toList());
		System.out.println(dropWhile);

		Stream.iterate(1, i -> i <= 10, i -> i * 3)
				.forEach(System.out::println);
	}

}
