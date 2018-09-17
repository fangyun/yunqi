/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 未 implements 支 {

	private static final 未 INSTANCE = new 未();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "未";
	}

	@Override
	public int order() {
		return 8;
	}

	public static 未 getInstance() {
		return INSTANCE;
	}

}
