/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 申 implements 支 {

	private static final 申 INSTANCE = new 申();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "申";
	}

	@Override
	public int order() {
		return 9;
	}

	public static 申 getInstance() {
		return INSTANCE;
	}

}
