package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Service {
	List<String> list = new ArrayList<String>();
	
	public void addItem(String snack)
	{
		this.list.add(snack);
	}
	
	public void deleteItem(String snack)
	{
		this.list.remove(snack);
	}

	public List<String> createList()
	{
		this.list.add("Candy");
		this.list.add("Chocolate");
		this.list.add("Chips");
		return this.list;
	}

	public List<String> getList() 
	{
		return this.list;
	}
}