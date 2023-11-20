package com.app.TDD;

import java.util.HashMap;
import java.util.Map;

public class ELearning {

	
	private Map<String, Integer> getcourse() {

		Map<String, Integer> getcourse = new HashMap<>();

		Map<String, Integer> course1 = null;
		course1.put("Selenium", 10);
		Map<String, Integer> course2 = null;
		course2.put("Junit", 25);
		Map<String, Integer> course3 = null;
		course3.put("Git", 2);
		
		return getcourse;

	}
	public int getcourse(String Topic) {

		

		Map<String, Integer> courseMap = null;
		int count = 0;

		if (Topic.isEmpty()) {
			throw new NullPointerException("Topic Name cannot be empty..");
		}

		courseMap = getcourse();

		if (!courseMap.containsKey(Topic)) {
			throw new NullPointerException("Topic Name does not exist");
		} else {
			count = courseMap.get(Topic);
		}

		return count;
	}

}
