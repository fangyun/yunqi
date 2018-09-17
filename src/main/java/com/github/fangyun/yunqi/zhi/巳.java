/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 巳 implements 支 {

	private static final 巳 INSTANCE = new 巳();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "巳";
	}

	@Override
	public int order() {
		return 6;
	}

	public static 巳 getInstance() {
		return INSTANCE;
	}

}
