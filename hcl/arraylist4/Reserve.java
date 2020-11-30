package com.hcl.arraylist4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reserve {

	public static void main(String[] args)throws IOException  {
		List<Emp> empList = new ArrayList<>();
		BufferedReader reader=null;
		try
		{
		 reader = new BufferedReader(new FileReader("dura.csv"));
		String line = null;
		Scanner scanner = null;
		int index = 0;

		while ((line = reader.readLine()) != null) {
			Emp emp = new Emp();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setNo(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setNumber(Long.parseLong(data));
				else if (index == 3)
					emp.setDuration(Integer.parseInt(data));
				else if (index == 4)
					emp.setDate(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not  found");
		}
		System.out.println("name"+"\t"+"phoneno"+"\t"+"duration");
		for(Emp e:empList)
		{
			System.out.println(e);
		}
	}

}
