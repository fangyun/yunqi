/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 太阳 implements 极 {
	private static final 太阳 INSTANCE = new 太阳();
	
	public static 太阳 getInstance() {
		return INSTANCE;
	}

	@Override
	public 太阳 getPolarity() {
		return INSTANCE;
	}
}
