package com.vdurmont.emoji;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmojiJsonTest.class, EmojiLoaderTest.class, 
	EmojiManagerTest.class, simpleTest_wei.class })
public class AllTests_wei {

}
