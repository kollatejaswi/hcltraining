package com.hcl.collection6;

import java.util.Comparator;

public class CustomerName implements Comparator<Details> {
	public int compare(Details d1,Details d2)
	{
	  return -d1.getName().compareTo(d2.getName()) 	;
	}

}
