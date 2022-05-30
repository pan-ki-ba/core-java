package com.pankiba.generics.boundedwildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayWithLowerBoundedWildCard {
	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		numsUpTo(5, integerList);

		ArrayList<Number> numberList = new ArrayList<Number>();
		numsUpTo(5, numberList);

		ArrayList<Object> objectList = new ArrayList<Object>();
		numsUpTo(5, objectList);
	}

	/**
	 * 
	 * PECS - Producer extends and Consumer Super
	 * 
	 * Use super when you only put values into a data structure
	 * 
	 * A lower bounded wild card means any ancestor to your class is acceptable. You use the super keyword with the wild
	 * card to specify a lower bound. In the case of a List<? super Number>, the implication is that the reference could
	 * represent List<Number> or List<Object>
	 * 
	 * ? super Integer translates to "any type that is an Integer type or its super type"
	 * 
	 */

	public static void numsUpTo(Integer number, List<? super Integer> list) {

		IntStream.rangeClosed(1, number).forEach(list::add);

		log.info(" {} ", list);

	}
}
