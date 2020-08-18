package com.vdurmont.emoji;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleTest_wei {

	@Test
	public void test() {
		String input = ":smiley: is smiling!";
		String output = EmojiParser.parseToUnicode(input);
		assertEquals("😃 is smiling!",output);
	}

}
