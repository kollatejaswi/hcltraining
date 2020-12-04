package com.hcl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFliter4 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("orange");
		al.add("lemon");
		Long fruit=al.stream().filter(fu->fu.length()==6).count();
		System.out.println(fruit);

	}

}
