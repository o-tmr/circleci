package com.example.otmr.circlecieclipse;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class HelloTest {

	@Test
	public void hello() {
		Hello h = new Hello();
		h.setName("tarou");
		h.setId(12345);
		assertThat("tarou", is(h.getName()));
		assertThat(12345, is(h.getId()));
	}
}
