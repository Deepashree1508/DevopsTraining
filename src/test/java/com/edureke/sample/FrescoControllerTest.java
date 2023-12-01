package com.edureke.sample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.edureka.sample.FrescoController;
@Testable
public class FrescoControllerTest {

	FrescoController fc= new FrescoController();
	@Test
	void displayNameTest() {
		Assertions.assertEquals("Hello welcome", fc.displayName("welcome"));
	}
}
