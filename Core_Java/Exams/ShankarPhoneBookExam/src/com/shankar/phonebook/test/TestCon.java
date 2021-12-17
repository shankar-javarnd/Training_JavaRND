package com.shankar.phonebook.test;

import com.shankar.phonebook.db.DBUtility;

public class TestCon {

	public static void main(String[] args) {
		DBUtility db = new DBUtility();
		System.out.println(db.testCon());
	}

}
