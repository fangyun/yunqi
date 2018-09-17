/**
 * @Copyright 2018
 */
package com.github.fangyun.yunqi.zhi;

/**
 * @author FangYun
 *
 */
public class 戌 implements 支 {

	private static final 戌 INSTANCE = new 戌();

	/* (non-Javadoc)
	 * @see com.github.fangyun.yunqi.zhi.Zhi#chineseName()
	 */
	@Override
	public String chineseName() {
		return "戌";
	}

	@Override
	public int order() {
		return 11;
	}

	public static 戌 getInstance() {
		return INSTANCE;
	}

	
}
