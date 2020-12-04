package com.hcl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StreamFliter {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(5);
		al.add(15);
		List<Integer> li=al.stream().filter(ele->ele%2==0).collect(Collectors.toList());
		System.out.println(li);

	}

}
