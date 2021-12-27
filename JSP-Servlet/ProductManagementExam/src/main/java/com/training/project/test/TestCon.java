package com.training.project.test;

import com.training.project.db.DBUtility;

public class TestCon {
	public static void main(String[] args) {
		DBUtility db = new DBUtility();
		System.out.println(db.testCon());
	}

}
