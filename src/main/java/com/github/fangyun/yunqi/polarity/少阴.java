/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

/**
 * @author FangYun
 *
 */
public class 少阴  extends 阴 {
	private static final 少阴 INSTANCE = new 少阴();
	
	public static 少阴 getInstance() {
		return INSTANCE;
	}

	@Override
	public 少阴 getPolarity() {
		return INSTANCE;
	}
}
