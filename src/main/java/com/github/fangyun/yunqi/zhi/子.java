/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 子 implements 支 {

	private static final 子 INSTANCE = new 子();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "子";
	}

	@Override
	public int order() {
		return 1;
	}

	public static 子 getInstance() {
		return INSTANCE;
	}

}
