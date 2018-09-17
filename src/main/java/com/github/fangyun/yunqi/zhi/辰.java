/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 辰 implements 支 {
	private static final 辰 INSTANCE = new 辰();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "辰";
	}

	@Override
	public int order() {
		return 5;
	}

	public static 辰 getInstance() {
		return INSTANCE;
	}

}
