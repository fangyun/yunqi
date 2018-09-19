/**
阳.java * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 阳明 implements 极 {
	private static final 阳明 INSTANCE = new 阳明();
	
	public static 阳明 getInstance() {
		return INSTANCE;
	}

	@Override
	public 阳明 getPolarity() {
		return INSTANCE;
	}
}
