/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.polarity;

import com.github.fangyun.yunqi.极;

/**
 * @author FangYun
 *
 */
public class 阴 implements 极 {

	private static final 阴 INSTANCE = new 阴();
	
	public static 阴 getInstance() {
		return INSTANCE;
	}

	@Override
	public 阴 getPolarity() {
		return INSTANCE;
	}
}
