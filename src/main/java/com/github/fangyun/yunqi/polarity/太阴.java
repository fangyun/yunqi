/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 太阴 implements 极 {
	private static final 太阴 INSTANCE = new 太阴();
	
	public static 太阴 getInstance() {
		return INSTANCE;
	}

	@Override
	public 太阴 getPolarity() {
		return INSTANCE;
	}
}
