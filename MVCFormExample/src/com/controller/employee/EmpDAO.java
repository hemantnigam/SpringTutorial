package com.controller.employee;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	static List<Emp> list=new ArrayList<Emp>();
	static int count=1;
	public static void addEmp(Emp emp) {
		emp.setId(count++);
		list.add(emp);
	}
	public static List<Emp> getEmpList() {
		return list;
	}
	
}
