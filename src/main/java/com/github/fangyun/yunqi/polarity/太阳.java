/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

/**
 * @author FangYun
 *
 */
public class 太阳 extends 阳 {
	private static final 太阳 INSTANCE = new 太阳();
	
	public static 太阳 getInstance() {
		return INSTANCE;
	}

	@Override
	public 太阳 getPolarity() {
		return INSTANCE;
	}
}
