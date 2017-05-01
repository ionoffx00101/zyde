package com.coffee.zyde.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coffee.zyde.HomeController;

public class HomeControllerTest {

	@Test
	public void test() {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}

}
