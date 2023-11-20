package com.app.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestELearning {

	@Test
	public void findcourse() {

		String Topic = "Selinium";

		int Expectedduration = 10;

		ELearning cs = new ELearning();

		// number of people in the city

		int count = cs.getcourse(Topic);

		System.out.println(count);

		Assert.assertEquals(count, Expectedduration);

	}

	@Test
	public void findEmptyInput() {

		try {
			String Topic = "";
			int Expectedduration = 0;
			ELearning cs = new ELearning();

			int count = cs.getcourse(Topic);

		} catch (NullPointerException e) {

			System.out.println("Topic name cannot be empty");
		}

	}

	

	}



		
