package com.hcl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFliter2 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("orange");
		al.add("lemon");
		List<String> fruit=al.stream().filter(fu->fu.indexOf('n')>0).collect(Collectors.toList());
		System.out.println(fruit);

	}

}
