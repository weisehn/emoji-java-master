package com.vdurmont.emoji;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class mockitoTest_wei {
	@Test
	public void mockitoTest_wei(){
		Emoji emoji = mock(Emoji.class);
		// 未设置桩模块 
		String result = emoji.getUnicode();
		System.out.println(result);
		//设置桩模块
		when(emoji.getUnicode()).thenReturn("😃😃😃");
		//验证桩模块效果
		result = emoji.getUnicode();
		System.out.println(result);
		Assert.assertEquals("😃😃😃", result);
	}

}

