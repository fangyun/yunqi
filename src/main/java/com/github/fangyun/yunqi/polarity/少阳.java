/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 少阳 implements 极 {
	private static final 少阳 INSTANCE = new 少阳();
	
	public static 少阳 getInstance() {
		return INSTANCE;
	}

	@Override
	public 少阳 getPolarity() {
		return INSTANCE;
	}
}
