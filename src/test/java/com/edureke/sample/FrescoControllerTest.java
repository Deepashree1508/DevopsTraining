package com.edureke.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.edureka.sample.FrescoController;

public class FrescoControllerTest {

	FrescoController fc= new FrescoController();
	@Test
	void displayNameTest() {
		Assertions.assertEquals("Hello welcome", fc.displayName("welcome"));
	}
}
