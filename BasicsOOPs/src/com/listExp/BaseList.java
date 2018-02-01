package com.listExp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseList {
		
	private EmpJson addvalueToList() {
		EmpJson empjss = new EmpJson();
		empjss.setId(100);
		empjss.setName("Ganesh");
		empjss.setAcc("Developer");
		empjss.setDoj(9122015);
		empjss.setEmail("avd@gjhjhb");
		empjss.setEtype("Salaried");
		empjss.setGender("Male");
		empjss.setMob(12345666);
		empjss.setQual("BE");
		
		return empjss;
		
	}
	
	public void showList(List<EmpJson> emp) {
		
		Iterator<EmpJson> iterator = emp.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (EmpJson e: emp) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		BaseList baseList = new BaseList();
		
		
		// TODO Auto-generated method stub
		List<EmpJson> emp = new ArrayList<>();
		
		emp.add(baseList.addvalueToList());
		
		baseList.showList(emp);
		
		List<String> str = new ArrayList<>();
		str.add("asad");
		str.add("12123");
		str.add("fsdf");
		str.add("werw");
		str.add("asdsfsad");
Iterator<String> iterator = str.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
