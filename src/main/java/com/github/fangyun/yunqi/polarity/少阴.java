/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 少阴 implements 极 {
	private static final 少阴 INSTANCE = new 少阴();
	
	public static 少阴 getInstance() {
		return INSTANCE;
	}

	@Override
	public 少阴 getPolarity() {
		return INSTANCE;
	}
}
