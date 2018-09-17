/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 午 implements 支 {

	private static final 午 INSTANCE = new 午();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "午";
	}

	@Override
	public int order() {
		return 7;
	}

	public static 午 getInstance() {
		return INSTANCE;
	}

}
