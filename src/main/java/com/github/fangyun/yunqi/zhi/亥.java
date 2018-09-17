/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 亥 implements 支 {

	private static final 亥 INSTANCE = new 亥();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "亥";
	}

	@Override
	public int order() {
		return 12;
	}

	public static 亥 getInstance() {
		return INSTANCE;
	}
}
