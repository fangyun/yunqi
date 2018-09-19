/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 厥阴 implements 极 {
	private static final 厥阴 INSTANCE = new 厥阴();
	
	public static 厥阴 getInstance() {
		return INSTANCE;
	}

	@Override
	public 厥阴 getPolarity() {
		return INSTANCE;
	}
}
