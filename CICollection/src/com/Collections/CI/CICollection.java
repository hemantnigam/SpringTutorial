package com.Collections.CI;

import java.util.Iterator;
import java.util.List;

public class CICollection {
	private int id;
	private String name;
	private List<String> answers; 
	public CICollection(int id,String name, List<String> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	public void dislay() {
		System.out.println(id+" "+name);
		System.out.println("answers are:");
		Iterator<String> itr=answers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
